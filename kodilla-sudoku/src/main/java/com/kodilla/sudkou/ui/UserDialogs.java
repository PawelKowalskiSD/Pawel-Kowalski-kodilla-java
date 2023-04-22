package com.kodilla.sudkou.ui;

import com.kodilla.sudkou.Move;

import java.util.Scanner;

public class UserDialogs {

    public static Move userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How use program: " +
                "Set: (col, row, value)");
        System.out.println("If you wont resolve sudoku set: SUDOKU");
        System.out.println("Set value: ");
        while (true) {
            String s = scanner.nextLine();
            try {
                int col = Integer.parseInt(s.substring(0,1));
                int row = Integer.parseInt(s.substring(1,2));
                int playerChoice = Integer.parseInt(s.substring(2,3));
                if ((col > 0 && col < 10) && (row > 0 && row < 10) && (playerChoice > 0 && playerChoice < 10))
                    return new Move(col, row, playerChoice);
                else
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("Wrong move try again");
            }
        }
    }
}
