package com.kodilla.rps.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {

    private boolean gameWithComputer;
    private int numberOfGames;

    public Board(final boolean gameWithComputer, final int numberOfGames) {
        this.numberOfGames = numberOfGames;
        this.gameWithComputer = gameWithComputer;
    }
    public Board() {
    }

    public boolean select(Select select) {
        return false;
    }

    public boolean isWinner() {
        return false;
    }

    public void checkWinner() {
    }

    public void count(Board board) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        while (board.getNumberOfGames() >= sum) {
            System.out.println("Round: " + sum);
            scanner.nextLine();
            sum++;
        }
    }

    public List<Symbols> getSymbol() {
        List<Symbols> symbolsList = new ArrayList<>();
        symbolsList.add(Symbols.ROCK);
        symbolsList.add(Symbols.PAPER);
        symbolsList.add(Symbols.SCISSOR);
        symbolsList.add(Symbols.LIZARD);
        symbolsList.add(Symbols.SPOKE);
        return symbolsList;
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
