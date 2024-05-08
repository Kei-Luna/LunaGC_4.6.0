package emu.grasscutter.command.commands;

import emu.grasscutter.GameConstants;

public enum Element {
    elementless(501, 701),
    pyro(502, 702),
    hydro(503, 703),
    anemo(504, 704),
    cryo(505, 705),
    geo(506, 706),
    electro(507, 707),
    dendro(508, 708);
    private final int boyId;
    private final int girlId;

    Element(int boyId, int girlId) {
        this.boyId = boyId;
        this.girlId = girlId;
    }
    
    public int getSkillRepoId(int avatarId) {
        return avatarId == GameConstants.MAIN_CHARACTER_MALE ? boyId : girlId;
    }
}