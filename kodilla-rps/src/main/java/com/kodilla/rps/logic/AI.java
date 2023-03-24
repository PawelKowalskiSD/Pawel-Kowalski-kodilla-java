package com.kodilla.rps.logic;

import java.util.Random;

public class AI {

    private static Select select;
    public static Select selectSymbol(Board board) {
        Symbols computerSymbol = board.getSymbol().get(new Random().nextInt(board.getSymbol().size()));
        return new Select(computerSymbol);
    }
}
