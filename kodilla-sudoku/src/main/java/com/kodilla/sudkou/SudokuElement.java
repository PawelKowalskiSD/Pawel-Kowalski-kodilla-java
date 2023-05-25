package com.kodilla.sudkou;

public class SudokuElement {
    private int value;
    public static int EMPTY = 0;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
