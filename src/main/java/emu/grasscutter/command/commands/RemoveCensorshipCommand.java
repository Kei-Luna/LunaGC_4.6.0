package emu.grasscutter.command.commands;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.packet.send.PacketWindy;
import java.util.List;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;

@Command(label = "RemoveCensorship", usage = "RemoveCensorship", aliases = { "cancer", "rc" }, permission = "player.windy", permissionTargeted = "player.windy.others")
public class RemoveCensorshipCommand implements CommandHandler
{
    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
		
		String path = "RemoveCensorship";
		targetPlayer.sendPacket(new PacketWindy(path));
    CommandHandler.sendMessage(sender, "Censhorship removed successfully.");
    }
}
