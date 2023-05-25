package com.kodilla.sudkou;

public class Move {
    private int col;
    private int row;
    private int value;

    private Symbol symbol;

    public Move(int col, int row, int value) {
        this.col = col;
        this.row = row;
        this.value = value;
    }

    public Move(Symbol symbol) {
        this();
        this.symbol = symbol;
    }

    public Move() {

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
