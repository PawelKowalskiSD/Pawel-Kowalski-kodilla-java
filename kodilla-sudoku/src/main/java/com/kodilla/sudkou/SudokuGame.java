package com.kodilla.sudkou;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    public boolean resolveSudoku() {
        return false;
    }

    public void getBoard() {
    List<BoardRow> cols = new ArrayList<>();
        for (int col = 0; col < 10; col++) {
            cols.add(new BoardRow());
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = s + "| ";
        }
        return s;
    }
}
