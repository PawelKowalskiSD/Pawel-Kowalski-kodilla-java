package com.kodilla.rps.logic;

import java.util.Objects;

public class Statistic {

    private final int round;
    private final int numberOfGames;

    Player player;
    Score score;

    public Statistic(int round, int numberOfGames, Player player, Score score) {
        this.round = round;
        this.numberOfGames = numberOfGames;
        this.player = player;
        this.score = score;
    }

    public int getRound() {
        return round;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public Player getPlayer() {
        return player;
    }

    public Score getScore() {
        return score;
    }
}
