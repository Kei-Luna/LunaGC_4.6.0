package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.quest.*;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.scripts.ScriptLib;
import java.util.Arrays;

@QuestValueExec(QuestExec.QUEST_EXEC_ADD_SCENE_TAG)
public final class ExecAddSceneTag extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var param =
                Arrays.stream(paramStr).filter(i -> !i.isBlank()).mapToInt(Integer::parseInt).toArray();
		quest.getOwner().getProgressManager().addSceneTag(param[0], param[1]);
		
        return true;
    }
}
