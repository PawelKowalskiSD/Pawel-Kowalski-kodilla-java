package com.kodilla.rps.logic;

public enum Symbols {
    LIZARD, ROCK, PAPER, SPOKE, SCISSOR;


    public static Symbols getLizard() {
        return LIZARD;
    }

    public static Symbols getRock() {
        return ROCK;
    }

    public static Symbols getPaper() {
        return PAPER;
    }

    public static Symbols getSpoke() {
        return SPOKE;
    }

    public static Symbols getScissor() {
        return SCISSOR;
    }

    public Symbols showSymbols(Symbols symbols) {
        switch (symbols) {
            case ROCK -> System.out.println("ROCK");
            case PAPER -> System.out.println("PAPER");
            case SPOKE -> System.out.println("SPOKE");
            case LIZARD -> System.out.println("LIZARD");
            case SCISSOR -> System.out.println("SCISSOR");
        }
        return symbols;
    }
}
