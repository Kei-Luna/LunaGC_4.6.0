package emu.grasscutter.command;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.commands.ResetConstCommand;
import emu.grasscutter.command.commands.SetConstCommand;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.commands.Element;

import java.util.ArrayList;
import java.util.List;

public class ConstellationsHandler {
    public static void change(Player targetPlayer, Element element, int constellation){

        try {
            ResetConstCommand rcc = new ResetConstCommand();
            List<String> args = new ArrayList<>();
            rcc.execute(null, targetPlayer, args);
            SetConstCommand scc = new SetConstCommand();
            args.add(String.valueOf(constellation));
            scc.execute(null, targetPlayer, args);

        } catch (Exception e){
            Grasscutter.getLogger().info("ConstellationHandler error");
        }
    }
}
