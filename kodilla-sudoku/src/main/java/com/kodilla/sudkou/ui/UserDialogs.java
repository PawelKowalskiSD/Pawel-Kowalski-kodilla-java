package com.kodilla.sudkou.ui;

import com.kodilla.sudkou.*;

import java.util.Scanner;

public class UserDialogs {

    public static Move userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How use program: " +
                "Set: (col, row, value)");
        System.out.println("If you wont resolve sudoku set: SUDOKU");
        System.out.println("If you wont add demo value set: DEMO");
        System.out.println("Set value: ");

        while (true) {
            try {
                String s = scanner.nextLine();
                if(s.equalsIgnoreCase("SUDOKU")) {
                    return new Move(Symbol.SUDOKU_SOLVER);
                }
                if(s.equalsIgnoreCase("DEMO")) {
                    return new Move(Symbol.DEMO);
                }
                int col = Integer.parseInt(s.substring(0,1));
                int row = Integer.parseInt(s.substring(1,2));
                int playerChoice = Integer.parseInt(s.substring(2,3));

                if((col >= 0 && col < 9) && (row >= 0 && row < 9) && (playerChoice > 0 && playerChoice < 10))
                        return new Move(col, row, playerChoice);

            } catch (Exception e) {
                System.out.println("Wrong move try again");
            }
        }
    }
}

