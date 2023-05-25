package com.kodilla.sudkou;

public class SudokuGame {

    public void sudokuSolver(SudokuBoard sudokuBoard) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuBoard.getValue(col, row) == SudokuElement.EMPTY) {
                    for (int i = 1; i <= 9; i++) {
                        if (possibleValue(col, row, i, sudokuBoard)) {
                            sudokuBoard.setValue(col, row, new SudokuElement(i));
                            sudokuSolver(sudokuBoard);
                            sudokuBoard.setValue(col, row, new SudokuElement(SudokuElement.EMPTY));
                        }
                    }
                    return;
                }
            }

        }
        System.out.println(sudokuBoard);
    }


    public boolean resolveSudoku() {
        return true;
    }

    public boolean possibleValue(int col, int row, int value, SudokuBoard sudokuBoard) {
        if (checkValue(col, row, value, sudokuBoard)) return false;
        return true;
    }

    private static boolean checkValue(int col, int row, int value, SudokuBoard sudokuBoard) {
        for (int rows = 0; rows < 9; rows++) {
            if (sudokuBoard.getValue(col, rows) == value)
                return true;
        }
        for (int cols = 0; cols < 9; cols++) {
            if (sudokuBoard.getValue(cols, row) == value)
                return true;
        }
        col = (col / 3) * 3;
        row = (row / 3) * 3;
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 3; cols++) {
                int sumCol = col + cols;
                int sumRow = row + rows;
                if (sudokuBoard.getValue(sumCol, sumRow) == value)
                    return true;
            }
        }
        return false;
    }

//    public void count(int col, int row, int value, SudokuBoard sudokuBoard) {
//        for (int rows = 0; rows < 9; rows++) {
//            if (sudokuBoard.getValue(col, rows) == value) {
//                System.out.println("in cols ------ col = " + col + " row = " + rows);
//            }
//
//        }
//        for (int cols = 0; cols < 9; cols++) {
//            if (sudokuBoard.getValue(cols, row) == value) {
//                System.out.println("in rows ======== col = " + cols + " row = " + row);
//            }
//            }
//        col = (col / 3) * 3;
//        row = (row / 3) * 3;
//        for (int rows = 0; rows < 3; rows++) {
//            for (int cols = 0; cols < 3; cols++) {
//                int sumCol = col + cols;
//                int sumRow = row + rows;
//                if (sudokuBoard.getValue(sumCol, sumRow) == value) {
//                    System.out.println("col = " + sumCol + " row = " + sumRow);
//                }
//            }
//        }
//    }
}
