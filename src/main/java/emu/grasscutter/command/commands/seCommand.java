package emu.grasscutter.command.commands;

import emu.grasscutter.GameConstants;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.avatar.AvatarSkillDepotData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketSceneEntityAppearNotify;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.command.ConstellationsHandler;

import java.util.List;

import static emu.grasscutter.utils.lang.Language.translate;

@Command(label = "switchelement",usage="anemo|geo|electro|dendro",aliases = {"se"}, threading = true)
public class seCommand implements CommandHandler {

    private Element getElementFromString(String elementString) {
        return switch (elementString.toLowerCase()) {
            case "white", "common" -> Element.elementless;
            case "fire", "pyro" -> Element.pyro;
            case "water", "hydro" -> Element.hydro;
            case "wind", "anemo", "air" -> Element.anemo;
            case "ice", "cryo" -> Element.cryo;
            case "rock", "geo" -> Element.geo;
            case "electro" -> Element.electro;
            case "grass", "dendro", "plant" -> Element.dendro;
            default -> null;
        };
    }

    private boolean changeAvatarElement(Player sender, int avatarId, Element element) {
        Avatar avatar = sender.getAvatars().getAvatarById(avatarId);
        AvatarSkillDepotData skillDepot = GameData.getAvatarSkillDepotDataMap().get(element.getSkillRepoId(avatarId));
        if (avatar == null || skillDepot == null) {
            return false;
        }
        avatar.setSkillDepotData(skillDepot);
        avatar.setCurrentEnergy(1000);
        avatar.save();
        return true;
    }
    @Override
    public void execute(Player sender,Player targetPlayer, List<String> args) {
        String UserName=targetPlayer.getAccount().getUsername();
        if (args.size() < 1) {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, "/se [anemo|geo|electro|dendro]");
            }
            else {
                Grasscutter.getLogger().info("/se [anemo|geo|electro|dendro]");
            }
            return;
        }
        Element element = getElementFromString(args.get(0));
        if (element == null) {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, "Error : Invalid Element");
            }
            else {
                Grasscutter.getLogger().info("Error : Invalid Element");
            }
            return;
        }
        int constellation = 0;
        if (args.size() > 1) {
            try {
                constellation = Integer.parseInt(args.get(1));
                if (constellation>6){
                    constellation=6;
                } else if (constellation<0) {
                   constellation = 0;
                }
            }
            catch (Exception e){
                if (sender != null) {
                    CommandHandler.sendMessage(targetPlayer, "Error : Invalid Constellation");
                }
                else {
                    Grasscutter.getLogger().info("Error : Invalid Constellation");
                }
            }
        }
        boolean maleSuccess = false;
        boolean femaleSuccess = false;
        if(targetPlayer.getTeamManager().getCurrentAvatarEntity().getAvatar().getAvatarId() == GameConstants.MAIN_CHARACTER_MALE) {
            maleSuccess = changeAvatarElement(targetPlayer, GameConstants.MAIN_CHARACTER_MALE, element);
            ConstellationsHandler.change(targetPlayer, element, constellation);
        } else if (targetPlayer.getTeamManager().getCurrentAvatarEntity().getAvatar().getAvatarId() == GameConstants.MAIN_CHARACTER_FEMALE) {
            femaleSuccess = changeAvatarElement(targetPlayer, GameConstants.MAIN_CHARACTER_FEMALE, element);
            ConstellationsHandler.change(targetPlayer, element, constellation);
        }
        if (maleSuccess || femaleSuccess) {
            int scene = targetPlayer.getSceneId();
            String message;
            try {
                Position targetPlayerPos = targetPlayer.getPosition();
                targetPlayer.getWorld().transferPlayerToScene(targetPlayer, 1, targetPlayerPos);
                targetPlayer.getWorld().transferPlayerToScene(targetPlayer, scene, targetPlayerPos);
                targetPlayer.getScene().broadcastPacket(new PacketSceneEntityAppearNotify(targetPlayer));
                message = String.format("Switch success", element.name());
            } catch (Exception e) {
                message = String.format("Failed", element.name());
            }
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, message);
            }
            else {
                Grasscutter.getLogger().info(message);
            }
        } else {
            if (sender != null) {
                CommandHandler.sendMessage(targetPlayer, "Switch failed");
            }
            else {
                Grasscutter.getLogger().info("Switch failed");
            }
        }
    }
}