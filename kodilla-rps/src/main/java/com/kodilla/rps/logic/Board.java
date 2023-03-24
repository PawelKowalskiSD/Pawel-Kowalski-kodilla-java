package com.kodilla.rps.logic;

public class Board {

    private boolean gameWithComputer;
    private int numberOfGames;

    public Board(final boolean gameWithComputer, final int numberOfGames) {
        this.numberOfGames = numberOfGames;
        this.gameWithComputer = gameWithComputer;
    }
    public Board() {
    }

    public boolean isWinner() {
        return false;
    }

    public void checkWinner() {
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public boolean isGameWithComputer() {
        return gameWithComputer;
    }

    public void setGameWithComputer(boolean gameWithComputer) {
        this.gameWithComputer = gameWithComputer;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }
}
