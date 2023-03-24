package com.kodilla.rps;

import com.kodilla.rps.logic.AI;
import com.kodilla.rps.logic.Board;
import com.kodilla.rps.logic.Select;
import com.kodilla.rps.ui.UserDialogs;

public class RpsRunner {

    public static void main(String[] args) {
        Board board = new Board();
        boolean end = false;
        UserDialogs.introduction(board);
        while (!end) {
            Select select = UserDialogs.getNextMove(board);
            if(select.isRestart()) {
                // wywołac introducion i resetować licznik pętli
            } else if (board.select(select)) {
                if(board.isGameWithComputer()) {
                    Select computerMove = AI.selectSymbol(board);
                    board.select(computerMove);
                }
                if(board.isWinner()) {
                    board.checkWinner();
                }
            }
        }

    }
}
