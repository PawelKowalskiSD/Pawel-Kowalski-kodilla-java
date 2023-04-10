package com.kodilla.rps.logic;

public class Display {

    public static void start() {
        System.out.println("============Start Game===============");
    }

    public static void next() {
        System.out.println("Next round----------->>>>>\n");
    }

    public static void displayMenu() {
        System.out.println("==========================");
        System.out.println("=  Press (1 - Rock)      =");
        System.out.println("=  Press (2 - Paper)     =");
        System.out.println("=  Press (3 - Scissor)   =");
        System.out.println("=  Press (4 - Lizard)    =");
        System.out.println("=  Press (5 - Spoke)     =");
        System.out.println("=  Press (X - quit Game) =");
        System.out.println("=  Press (N - New game)  =");
        System.out.println("==========================");
    }

    public static void displayResultsAfterRound(Statistic statistic, GameSymbols userSymbol, GameSymbols computerSymbol, Winner winner) {
        System.out.println("=====================================");
        System.out.println("Round: " + statistic.getRound() + " of " + statistic.getNumberOfGames());
        System.out.println(statistic.getPlayer() +  " choice: " + userSymbol);
        System.out.println(ComputerPlayer.BOT_ROMAN + " choice: " + computerSymbol);
        System.out.println("round winner is: " + winner);
        System.out.println(statistic.getPlayer() + ": " + statistic.getScore().getPlayerScore() + " score");
        System.out.println(ComputerPlayer.BOT_ROMAN + ": " + statistic.getScore().getComputerScore() + " score");
    }

    public static void whoHasWon(Statistic statistic, Score score) {
        System.out.println("============Game over===============");
        System.out.println("Round: " + statistic.getRound() + " of " + statistic.getNumberOfGames());
        System.out.println(statistic.getPlayer()+ " have: " + score.getPlayerScore() + " score");
        System.out.println(ComputerPlayer.BOT_ROMAN + " have: " + score.getComputerScore() + " score");
        if(score.getPlayerScore() > score.getComputerScore())
            System.out.println("Game winner is: " + statistic.getPlayer());
        if(score.getPlayerScore() < score.getComputerScore())
            System.out.println("Game winner is: " + ComputerPlayer.BOT_ROMAN);
        else if (score.getPlayerScore() == score.getComputerScore())
            System.out.println("It's a draw:)");
    }

    public static void displayName(Player userName) {
        System.out.println("Hello " + userName);
    }
}
