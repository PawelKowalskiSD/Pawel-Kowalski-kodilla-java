package com.kodilla.sudkou;

import com.kodilla.sudkou.ui.UserDialogs;

public class App {
    public static void main(String[] args) {
        boolean gameFinished = false;
        SudokuGame sudokuGame = new SudokuGame();
        System.out.println(sudokuGame);
        while (!gameFinished) {
            Move move = UserDialogs.userChoice();
            if(sudokuGame.resolveSudoku()) {

            } else
                gameFinished = true;
        }
   }


}
