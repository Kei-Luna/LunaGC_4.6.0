package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.data.binout.AbilityModifier;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.net.proto.ChangeHpDebtsOuterClass;
import emu.grasscutter.net.proto.PropChangeReasonOuterClass;
import emu.grasscutter.server.packet.send.PacketEntityFightPropChangeReasonNotify;
import emu.grasscutter.server.packet.send.PacketEntityFightPropUpdateNotify;
import emu.grasscutter.Grasscutter;

@AbilityAction(value = AbilityModifier.AbilityModifierAction.Type.AddHPDebts)
public final class ActionAddHPDebts extends AbilityActionHandler {
    @Override
    public boolean execute(Ability ability, AbilityModifier.AbilityModifierAction action, ByteString abilityData, GameEntity target) {
        float debt = action.ratio.get(ability) * target.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP);
        float maxValue = action.ratio.get(ability);
        Grasscutter.getLogger().warn("[ActionAddHPDebts] Called with debt {}", debt);

        if (target instanceof EntityAvatar) {
            float curDebt = target.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP_DEBTS);
            float newDebt = curDebt + debt;
            if (newDebt < 0) {
                newDebt = 0;
            } else if (newDebt > 2 * target.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP)) {
                newDebt = 2 * target.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP);
            }
            float changeDebt = newDebt - curDebt;
            target.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP_DEBTS, newDebt);
            target.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(target, FightProperty.FIGHT_PROP_CUR_HP_DEBTS));
            if (changeDebt != 0) {
                if (newDebt == 0) {
                    target.getWorld().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(target, FightProperty.FIGHT_PROP_CUR_HP_DEBTS, changeDebt, PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_ABILITY, ChangeHpDebtsOuterClass.ChangeHpDebts.CHANGE_HP_DEBTS_PAYFINISH));
                } else if (changeDebt > 0) {
                    target.getWorld().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(target, FightProperty.FIGHT_PROP_CUR_HP_DEBTS, changeDebt, PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_ABILITY, ChangeHpDebtsOuterClass.ChangeHpDebts.CHANGE_HP_DEBTS_ADDABILiTY));
                } else if (changeDebt < 0) {
                    target.getWorld().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(target, FightProperty.FIGHT_PROP_CUR_HP_DEBTS, changeDebt, PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_ABILITY, ChangeHpDebtsOuterClass.ChangeHpDebts.CHANGE_HP_DEBTS_PAY));
                }
            }
        } else {
            Grasscutter.getLogger().warn("[ActionAddHPDebts] CANNOT ADD HP DEBT TO NON AVATAR ENTITY");
            return false;
        }
        return true;
    }
}
