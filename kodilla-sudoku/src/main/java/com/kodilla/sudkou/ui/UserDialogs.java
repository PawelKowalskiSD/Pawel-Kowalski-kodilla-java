package com.kodilla.sudkou.ui;

import com.kodilla.sudkou.Move;

import java.util.Scanner;

public class UserDialogs {
    public static void getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your username:");
        while (true) {
            try {
                String name = scanner.nextLine();
                if (name.trim().length() > 2)
                    System.out.println("Hello " + name);
                return;
            } catch (Exception e) {
                System.out.println("Your name is to short try again");
            }
        }
    }

    public static void getLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: e-easy|h-hard");
        while (true) {
            String s = scanner.nextLine();
            try {
                if (s.equalsIgnoreCase("e")) {

                } else if (s.equalsIgnoreCase("h")) {

                } else
                    System.out.println("Wrong choice try again");
            } catch (Exception e) {
                System.out.println("Wrong choice try again");
            }
        }
    }

    public static Move userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move");
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
