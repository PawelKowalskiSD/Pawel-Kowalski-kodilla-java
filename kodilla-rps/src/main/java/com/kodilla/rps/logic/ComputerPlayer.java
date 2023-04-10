package com.kodilla.rps.logic;

import java.util.Random;

public class ComputerPlayer {

    static String BOT_ROMAN = "Bot_Roman";

    public static GameSymbols getPossibleSymbols(GameSymbols userSymbols) {
        Random randomGenerator = new Random();
        int computerGameSymbols = randomGenerator.nextInt(100);
        if (userSymbols == GameSymbols.ROCK) {
            return getGameSymbols(computerGameSymbols, GameSymbols.ROCK, GameSymbols.SCISSOR, GameSymbols.LIZARD, GameSymbols.PAPER, GameSymbols.SPOKE);
        }
        else if (userSymbols == GameSymbols.PAPER) {
            return getGameSymbols(computerGameSymbols, GameSymbols.PAPER, GameSymbols.ROCK, GameSymbols.LIZARD, GameSymbols.SCISSOR, GameSymbols.LIZARD);
        }
        else if (userSymbols == GameSymbols.SCISSOR) {
            return getGameSymbols(computerGameSymbols, GameSymbols.SCISSOR, GameSymbols.PAPER, GameSymbols.LIZARD, GameSymbols.ROCK, GameSymbols.SPOKE);
        }
        else if (userSymbols == GameSymbols.LIZARD) {
            return getGameSymbols(computerGameSymbols, GameSymbols.LIZARD, GameSymbols.PAPER, GameSymbols.SPOKE, GameSymbols.SCISSOR, GameSymbols.ROCK);
        }
        else {
            return getGameSymbols(computerGameSymbols, GameSymbols.SPOKE, GameSymbols.PAPER, GameSymbols.SCISSOR, GameSymbols.ROCK, GameSymbols.LIZARD);
        }
    }

    private static GameSymbols getGameSymbols(int computerGameSymbols, GameSymbols rock, GameSymbols scissor, GameSymbols lizard, GameSymbols paper, GameSymbols spoke) {
        if(computerGameSymbols < 25 && computerGameSymbols >= 0) {
            return rock;
        } else if (computerGameSymbols >= 25 && computerGameSymbols <= 37) {
            return scissor;
        } else if (computerGameSymbols > 37 && computerGameSymbols <=49) {
            return lizard;
        } else if (computerGameSymbols > 49 && computerGameSymbols <=74)
            return paper;
        else
            return spoke;
    }
}
