package com.kodilla.rps;

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
                UserDialogs.introduction(board);
            } else if (UserDialogs.select()) {

                if(board.isGameWithComputer()) {
                }
                if(board.isWinner()) {
                    board.checkWinner();
                }
            }
        }

    }
}
