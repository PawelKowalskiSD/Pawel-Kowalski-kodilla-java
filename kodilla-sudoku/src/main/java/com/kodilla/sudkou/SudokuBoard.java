package com.kodilla.sudkou;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int row = 0; row < 9; row++) {
            rows.add(new SudokuRow());
        }
    }

    public void init() {
        setValue(0, 2, new SudokuElement(7));
        setValue(0, 2, new SudokuElement(7));
        setValue(0, 3, new SudokuElement(2));
        setValue(0, 6, new SudokuElement(6));
        setValue(0, 7, new SudokuElement(9));
        setValue(1, 3, new SudokuElement(7));
        setValue(1, 4, new SudokuElement(5));
        setValue(1, 7, new SudokuElement(1));
        setValue(1, 8, new SudokuElement(4));
        setValue(2, 1, new SudokuElement(2));
        setValue(2, 2, new SudokuElement(4));
        setValue(2, 3, new SudokuElement(1));
        setValue(2, 7, new SudokuElement(3));
        setValue(2, 8, new SudokuElement(7));
        setValue(3, 0, new SudokuElement(6));
        setValue(3, 2, new SudokuElement(9));
        setValue(3, 3, new SudokuElement(5));
        setValue(3, 4, new SudokuElement(8));
        setValue(3, 5, new SudokuElement(7));
        setValue(3, 6, new SudokuElement(3));
        setValue(3, 7, new SudokuElement(4));
        setValue(4, 3, new SudokuElement(6));
        setValue(4, 7, new SudokuElement(8));
        setValue(4, 8, new SudokuElement(5));
        setValue(5, 2, new SudokuElement(5));
        setValue(5, 5, new SudokuElement(3));
        setValue(5, 6, new SudokuElement(1));
        setValue(5, 7, new SudokuElement(7));
        setValue(6, 0, new SudokuElement(5));
        setValue(6, 1, new SudokuElement(4));
        setValue(6, 6, new SudokuElement(7));
        setValue(6, 8, new SudokuElement(9));
        setValue(7, 0, new SudokuElement(7));
        setValue(7, 3, new SudokuElement(8));
        setValue(7, 4, new SudokuElement(2));
        setValue(7, 5, new SudokuElement(5));
        setValue(7, 6, new SudokuElement(4));
        setValue(7, 8, new SudokuElement(3));
        setValue(8, 0, new SudokuElement(3));
        setValue(8, 3, new SudokuElement(4));
        setValue(8, 7, new SudokuElement(5));
        setValue(8, 8, new SudokuElement(1));
    }

    public int getValue(int col, int row) {
        return rows.get(row).getCols().get(col).getValue();
    }

    public SudokuElement setValue(int col, int row, SudokuElement value) {
        return rows.get(row).getCols().set(col, value);
    }

    public boolean move(Move move) {
        boolean result = true;
        result = result && checkField(move);
        result = result && checkPossibleMove(move);

        if (result) {
            setValue(move.getCol(), move.getRow(), new SudokuElement(move.getValue()));
        }
        return result;
    }

    private boolean checkPossibleMove(Move move) {
        try {
            if (move.getSymbol() == Symbol.DEMO) {
                return true;
            }
            for (int row = 0; row < 9; row++) {
                if (getValue(move.getCol(), row) == move.getValue())
                    exception();
            }
            for (int col = 0; col < 9; col++) {
                if (getValue(col, move.getRow()) == move.getValue())
                    exception();
            }
            int cols = (move.getCol() / 3) * 3;
            int rows = (move.getRow() / 3) * 3;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    int sumCol = col + cols;
                    int sumRow = row + rows;
                    if (getValue(sumCol, sumRow) == move.getValue())
                        exception();
                }
            }
        } catch (Exception e) {
            System.out.println("can't add value in this field try again");
            return false;
        }
        return true;
    }

    private static void exception() throws Exception {
        throw new Exception();
    }

    private boolean checkField(Move move) {
        try {
            if (!(getValue(move.getCol(), move.getRow()) == SudokuElement.EMPTY))
                exception();
        } catch (Exception e) {
            System.out.println("Wrong choice this field has set value, try again");
        }
        return getValue(move.getCol(), move.getRow()) == SudokuElement.EMPTY;
    }

    @Override
    public String toString() {
        String s = "";
        for (int row = 0; row < 9; row++) {
            if (row == 0 || row == 3 || row == 6)
                s += "+ ===== + ===== + ===== +\n";
            s += rows.get(row);
        }
        s += "+ ===== + ===== + ===== +";
        return s;
    }
}
