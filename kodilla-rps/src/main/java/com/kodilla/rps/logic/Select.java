package com.kodilla.rps.logic;

public class Select {
    private final Symbols choice;
    private final boolean isRestart;

    public Select(Symbols choice, boolean isRestart) {
        this.choice = choice;
        this.isRestart = isRestart;
    }

    public Select(Symbols choice) {
        this(choice, false);
    }

    public Symbols getChoice() {
        return choice;
    }

    public boolean isRestart() {
        return isRestart;
    }


}
