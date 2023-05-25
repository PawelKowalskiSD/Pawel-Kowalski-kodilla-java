package com.kodilla.sudkou;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final List<SudokuElement> cols = new ArrayList<>();

    public SudokuRow() {
        for (int col = 0; col < 9; col++) {
            cols.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    public List<SudokuElement> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0; col < 9; col++) {
            s += " " + cols.get(col);
            if (col == 2 || col == 5) {
                s += " |";
            }
        }
        s += " |\n";
        return s;
    }
}
