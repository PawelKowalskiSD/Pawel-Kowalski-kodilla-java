package com.kodilla.rps.logic;

public final class Score {

    private final int playerScore;
    private final int computerScore;

    public Score(final int playerScore, final int computerScore) {
        this.playerScore = playerScore;
        this.computerScore = computerScore;
    }

    public static Winner calculateScore(GameSymbols userSymbol, GameSymbols computerSymbol) {
        if (userSymbol != computerSymbol) {
            if (userSymbol == GameSymbols.ROCK) {
                if (computerSymbol == GameSymbols.PAPER || computerSymbol == GameSymbols.SPOKE) {
                    return Winner.COMPUTER_WIN;
                } else
                    return Winner.YOU_WIN;
            }
            if (userSymbol == GameSymbols.PAPER) {
                if (computerSymbol == GameSymbols.LIZARD || computerSymbol == GameSymbols.SCISSOR) {
                    return Winner.COMPUTER_WIN;
                } else
                    return Winner.YOU_WIN;
            }
            if (userSymbol == GameSymbols.SCISSOR) {
                if (computerSymbol == GameSymbols.ROCK || computerSymbol == GameSymbols.SPOKE) {
                    return Winner.COMPUTER_WIN;
                } else
                    return Winner.YOU_WIN;
            }
            if (userSymbol == GameSymbols.LIZARD) {
                if (computerSymbol == GameSymbols.SCISSOR || computerSymbol == GameSymbols.ROCK) {
                    return Winner.COMPUTER_WIN;
                } else
                    return Winner.YOU_WIN;
            }
            if (userSymbol == GameSymbols.SPOKE) {
                if (computerSymbol == GameSymbols.LIZARD || computerSymbol == GameSymbols.PAPER) {
                    return Winner.COMPUTER_WIN;
                } else
                    return Winner.YOU_WIN;
            }
        }
        return Winner.DRAW;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }
}
