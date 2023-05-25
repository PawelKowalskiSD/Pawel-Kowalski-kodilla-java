package com.kodilla.sudkou;

import com.kodilla.sudkou.ui.UserDialogs;

public class App {
    public static void main(String[] args) {
        SudokuGame sudokuGame = new SudokuGame();
        SudokuBoard sudokuBoard = new SudokuBoard();
        int counter = 0;
        boolean gameFinished = false;
        while (!gameFinished) {
            System.out.println("value on board " + counter);
            System.out.println(sudokuBoard);
            Move move = UserDialogs.userChoice();
//            counter++;
            if(move.getSymbol() == Symbol.DEMO) {
                sudokuBoard.init();
            }

            if ((move.getSymbol() == Symbol.SUDOKU_SOLVER)) {
                sudokuGame.sudokuSolver(sudokuBoard);
                gameFinished = sudokuGame.resolveSudoku();
            } else if ((move.getSymbol() == Symbol.SUDOKU_SOLVER) && counter <= 3) {
                System.out.println("need add value");
            } else if (sudokuBoard.move(move))
                counter++;
        }

    }
}
