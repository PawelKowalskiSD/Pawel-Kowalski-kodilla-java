package com.kodilla.islands;

public class IslandCounter {

    public int numberIslands(String[][] mapIsland) {
        int count = 0;
        for (int i = 0; i < mapIsland.length; i++) {
            for (int j = 0; j < mapIsland.length; j++) {
                if (mapIsland[i][j].equals("x")) {
                    count += 1;
                    check(mapIsland, i, j);
                }
            }
        }
        return count;
    }

    public void check(String[][] mapIsland, int i, int j) {
        if (i < 0 || i >= mapIsland.length || j < 0 || j >= mapIsland[i].length || mapIsland[i][j].equals(".")) {
            return;
        } else
            mapIsland[i][j] = ".";
        check(mapIsland, i + 1, j);
        check(mapIsland, i - 1, j);
        check(mapIsland, i, j + 1);
        check(mapIsland, i, j - 1);
    }
}
