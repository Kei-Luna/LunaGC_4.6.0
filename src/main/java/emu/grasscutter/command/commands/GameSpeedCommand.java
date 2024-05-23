package emu.grasscutter.command.commands;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.packet.send.PacketWindy;
import java.util.List;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;

@Command(label = "GameSpeed", usage = "speed <0.1 | 0.2 | 0.5 | 0.75 | 1.0 | 1.5 | 2.0 | 3.0>", aliases = { "speed" }, permission = "player.windy", permissionTargeted = "player.windy.others")
public class GameSpeedCommand implements CommandHandler
{
    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
		
		String path = "GameSpeed/speed" + args.get(0);
		targetPlayer.sendPacket(new PacketWindy(path));
        CommandHandler.sendMessage(sender, "GameSpeed changed to " + args.get(0) + " successfully!");
    }
}
