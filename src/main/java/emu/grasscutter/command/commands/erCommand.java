package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.server.packet.send.PacketAvatarFightPropUpdateNotify;
import emu.grasscutter.server.packet.send.PacketAvatarLifeStateChangeNotify;

import java.util.List;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "ER", aliases = {"e", "er", "energy"}, permission = "player.setprop", permissionTargeted = "player.setprop.others")
public final class erCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        targetPlayer.getTeamManager().getActiveTeam().forEach(entity -> {
            boolean isAlive = entity.isAlive();
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_FIRE_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_FIRE_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_FIRE_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_ELEC_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_ELEC_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_ELEC_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_WATER_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_WATER_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_WATER_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_GRASS_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_GRASS_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_GRASS_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_WIND_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_WIND_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_WIND_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_ICE_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_ICE_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_ICE_ENERGY));
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_ROCK_ENERGY,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_ROCK_ENERGY)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_HP));
            if (!isAlive) {
                entity.getWorld().broadcastPacket(new PacketAvatarLifeStateChangeNotify(entity.getAvatar()));
            }
        });
        CommandHandler.sendMessage(sender, "Restored elemental energy successfully.");
    }
}
