package com.kodilla.islands;

public class appIslands {
    public static void main(String[] args) {
        String[][] mapIslands = {{".", ".", ".", "x", ".", ".", ".", "."},
                                 {".", ".", ".", "x", "x", ".", ".", "."},
                                 {".", ".", ".", ".", "x", "x", ".", "."},
                                 {".", ".", ".", ".", ".", ".", ".", "."},
                                 {".", ".", ".", ".", "x", "x", ".", "."},
                                 {".", ".", "x", "x", "x", "x", ".", "."},
                                 {".", ".", "x", "x", ".", ".", ".", "."},
                                 {".", ".", ".", ".", ".", ".", ".", "x"}};

        IslandCounter islandCounter = new IslandCounter();
        System.out.println(islandCounter.numberIslands(mapIslands));
    }

}
