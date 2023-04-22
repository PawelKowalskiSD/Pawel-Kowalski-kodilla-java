package com.kodilla.sudkou;


import java.util.ArrayList;
import java.util.List;

public class SudokuGame {

    private final List<BoardRow> rows = new ArrayList<>();
    private final List<Integer> possibleValue = new ArrayList<>();
    private int boardSize;

    public SudokuGame() {
    }


    public boolean resolveSudoku() {
        return false;
    }

    public List<BoardRow> getRows() {
        return rows;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public int getValue() {
       return 0;
    }
    @Override
    public String toString() {
        String s = "";
        for (int row = 0; row <= getBoardSize(); row++) {
            s += rows.get(row);
        }
        return s;
    }
}
