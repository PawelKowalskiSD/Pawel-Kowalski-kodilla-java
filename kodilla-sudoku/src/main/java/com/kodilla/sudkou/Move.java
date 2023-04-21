package com.kodilla.sudkou;

public class Move {

    private final int col;
    private final int row;
    private final int number;

    public Move(int col, int row, int number) {
        this.col = col;
        this.row = row;
        this.number = number;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }
}
