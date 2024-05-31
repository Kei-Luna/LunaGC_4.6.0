package emu.grasscutter.command.commands;

import com.github.davidmoten.guavamini.Lists;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import emu.grasscutter.server.packet.send.PacketWindSeedUID;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Command(label = "uid", usage = {
    "set <what you want>",
    "default"
}, permissionTargeted = "player.windy.others")
public class SetUIDWatermarkTextCommand implements CommandHandler {
    private static final List<Integer> PRE_BYTES = Lists.newArrayList(27, 76, 117, 97, 83, 1, 25, -109, 13, 10, 26, 10, 4, 4, 8, 8, 120, 86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 119, 64, 1, 21, 64, 67, 58, 92, 87, 105, 110, 100, 121, 92, 76, 117, 110, 97, 71, 67, 46, 108, 117, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 11, 0, 0, 0, 36, 0, 64, 0, 41, 64, 64, 0, 41, -128, 64, 0, 41, -64, 64, 0, 86, 0, 1, 0, 44, -128, 0, 1, 29, 64, 65, 0, -106, -128, 1, 0, 44, -128, -128, 1, 31, 0, -62, -125, 25, 0, -128, 0, 9, 0, 0, 0, 4, 3, 67, 83, 4, 12, 85, 110, 105, 116, 121, 69, 110, 103, 105, 110, 101, 4, 11, 71, 97, 109, 101, 79, 98, 106, 101, 99, 116, 4, 5, 70, 105, 110, 100, 4, 41, 47, 66, 101, 116, 97, 87, 97, 116, 101, 114, 109, 97, 114, 107, 67, 97, 110, 118, 97, 115, 40, 67, 108, 111, 110, 101, 41, 47, 80, 97, 110, 101, 108, 47, 84, 120, 116, 85, 73, 68, 4, 13, 71, 101, 116, 67, 111, 109, 112, 111, 110, 101, 110, 116, 4, 5, 84, 101, 120, 116, 4, 5, 116, 101, 120, 116, 4);
    private static final List<Integer> POST_BYTES = Lists.newArrayList(1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 11, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 5, 95, 69, 78, 86);
    private static final int MAX_LENGTH = Byte.MAX_VALUE - Byte.MIN_VALUE;

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.isEmpty()) {
            this.sendUsageMessage(sender);
            return;
        }

        switch (args.remove(0)) {
            case "set" -> this.set(sender, targetPlayer, args);
            case "default" -> this.setToDefault(sender, targetPlayer);
            default -> this.sendUsageMessage(sender);
        }
    }

    private void set(Player sender, Player target, List<String> args) {
        String text = String.join(" ", args);
        byte[] textBytes = text.getBytes(StandardCharsets.UTF_8);
        if (textBytes.length + 1 > MAX_LENGTH) {
            CommandHandler.sendMessage(sender, "The number of characters you entered is too large!"); // TODO: add translation.
            return;
        }
        CommandHandler.sendMessage(sender, "Successfully changed your UID to " + text);

        target.sendPacket(new PacketWindSeedClientNotify(toLuacBytes(textBytes)));
    }

    private void setToDefault(Player sender, Player target) {
        CommandHandler.sendMessage(sender, "Successfully restored your UID to the server-default one.");
        target.sendPacket(new PacketWindSeedUID());
    }

    private static byte[] toLuacBytes(byte[] textBytes) {
        List<Integer> bytes = new ArrayList<>(PRE_BYTES);
        bytes.add(Math.min(textBytes.length + 1, MAX_LENGTH)); // set text byte length.

        for (var b : textBytes) {
            bytes.add((int) b); // write bytes.
        }

        bytes.addAll(POST_BYTES);
        // unboxing
        byte[] data = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            data[i] = bytes.get(i).byteValue();
        }

        return data;
    }
}
