package com.kodilla.rps;

import com.kodilla.rps.logic.*;
import com.kodilla.rps.ui.UserDialogs;

public class RpsRunner {

    public static void main(String[] args) {

        int computerScore = 0;
        int playerScore = 0;
        int round = 1;
        boolean end = false;

        Player userName = UserDialogs.getUserName();
        Display.displayName(userName);
        int choiceRoundNumber = UserDialogs.getNumberOfRounds();
        Display.start();
        while (!end) {
            Display.displayMenu();
            GameSymbols userSymbol = UserDialogs.getPlayerChoice();
            if (userSymbol == GameSymbols.RESTART) {
                boolean result = UserDialogs.restartGame();
                if(result) {
                    round = 1;
                    playerScore = 0;
                    computerScore = 0;
                    choiceRoundNumber = UserDialogs.getNumberOfRounds();
                    Display.displayMenu();
                    userSymbol = UserDialogs.getPlayerChoice();
                } else {
                    Display.displayMenu();
                    userSymbol = UserDialogs.getPlayerChoice();
                }
            }
            if(userSymbol == GameSymbols.QUIT) {
                UserDialogs.exitGame();
                Display.displayMenu();
                userSymbol = UserDialogs.getPlayerChoice();
            }
            GameSymbols computerSymbol = ComputerPlayer.getPossibleSymbols(userSymbol);
            Winner winner = Score.calculateScore(userSymbol, computerSymbol);
            if(winner == Winner.YOU_WIN) {
                playerScore++;
            }
            else if (winner == Winner.COMPUTER_WIN) {
                computerScore++;
            }
            else {
                playerScore++;
                computerScore++;
            }
            Score score = new Score(playerScore,computerScore);
            Statistic statistic = new Statistic(round,choiceRoundNumber,userName, score);
                Display.displayResultsAfterRound(statistic, userSymbol, computerSymbol, winner);
                round++;
            if(round <= choiceRoundNumber)
                Display.next();
            if(round > choiceRoundNumber) {
                Display.whoHasWon(statistic, score);
                end = true;
            }
        }
    }
}
