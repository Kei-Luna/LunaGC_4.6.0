package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.server.event.player.PlayerTeleportEvent.TeleportType;
import emu.grasscutter.scripts.data.SceneConfig; //i think its needed for getting the born_pos to work right...
import emu.grasscutter.game.world.Position;

import emu.grasscutter.command.Command.TargetRequirement; //needed in order to remove the annoying @<UID> when trying to get the usage info for the command

import java.util.List;


@Command(
    label = "sceneteleporter",
    aliases = {"sc","scene","sceneteleport","sceneteleporter"},
    usage = "/scene /sceneteleport /sceneteleporter [SceneID] \n\ndescription: teleports you to the scene you want \n\nto leave domains use only this command (do not exit via the prompt)", 
    permission = "player.teleport", 
    permissionTargeted = "player.teleport.others",
    targetRequirement = TargetRequirement.NONE) //using "emu.grasscutter.command.Command.TargetRequirement" as mentioned above
public final class SceneTeleporterCommand implements CommandHandler {

// yeah i know, i copied the teleportcommand.java, but it works well so...

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {

        int sceneId = targetPlayer.getSceneId();

        switch (args.size()) {
            case 1:
                try {
                    sceneId = Integer.parseInt(args.get(0));
                }catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(sender,"teleportation failed! bad sceneID number");
                    return;
                }  // Fallthrough
                break;
            default:
                this.sendUsageMessage(sender);
                return;
        }

        if (targetPlayer.getWorld().getSceneById(sceneId) == null) {
            CommandHandler.sendMessage(sender,"teleportation failed! wrong or non-existent sceneID (error: sceneid is null)");  
        } else {

        Scene newScene = targetPlayer.getWorld().getSceneById(sceneId);
        SceneConfig config = newScene.getScriptManager().getConfig();

        if (config == null) {
            CommandHandler.sendMessage(sender,"teleportation failed! teleportation positions do not exist in the corresponding scene file! cannot teleport to scene (try manually with /tp instead)");  
        } else {

        Position pos = config.born_pos;
        targetPlayer.getRotation().set(config.born_rot);

        boolean result = targetPlayer.getWorld().transferPlayerToScene(targetPlayer, sceneId, TeleportType.COMMAND, pos);

        if (!result) {
            CommandHandler.sendMessage(sender,"teleportation failed! wrong or non-existent sceneID");
        } else {
            Position teleportedpos = targetPlayer.getPosition(); //get player position after teleportation
            Position teleportedrot = targetPlayer.getRotation();
            
            //CommandHandler.sendMessage(sender,targetPlayer.getNickname(),target_pos,sceneId);
            CommandHandler.sendMessage(sender, "teleportation was successful!" );
            CommandHandler.sendTranslatedMessage(sender, "commands.position.success",
            teleportedpos.getX(), teleportedpos.getY(), teleportedpos.getZ(), teleportedrot.getX(), teleportedrot.getY(), teleportedrot.getZ(), targetPlayer.getSceneId());
        }
    }
}
}
}
