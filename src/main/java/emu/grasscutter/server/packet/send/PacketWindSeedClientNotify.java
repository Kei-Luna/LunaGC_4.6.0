package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.WindSeedType1NotifyOuterClass.WindSeedType1Notify;
import emu.grasscutter.utils.FileUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PacketWindSeedClientNotify extends BasePacket {
    public PacketWindSeedClientNotify(String givenPath) {
        super(PacketOpcodes.WindSeedType1Notify);
        final Path path = Paths.get(givenPath, new String[0]);
        byte[] data;
        try {
            data = Files.readAllBytes(path);
        } catch (Exception e) {
            data = FileUtils.readResource("/lua/UID.luac");
        }
        WindSeedType1Notify proto = WindSeedType1Notify
            .newBuilder()
            .setPayload(ByteString.copyFrom(data))
            .build();

        this.setData(proto);
    }

    public PacketWindSeedClientNotify(byte[] data) {
        super(PacketOpcodes.WindSeedType1Notify);
        this.setData(WindSeedType1Notify.newBuilder().setPayload(ByteString.copyFrom(data)).build());
    }
}
