package com.kodilla.rps.ui;

import com.kodilla.rps.logic.*;

import java.util.Scanner;


public class UserDialogs {

   static Scanner scanner = new Scanner(System.in);

    public static boolean restartGame() {
        System.out.println("Do you want restart this game? (Y/N)");
        String s = scanner.nextLine();
        while (true) {
            if (s.equalsIgnoreCase("Y")) {
                return true;
            }
            if (s.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

    public static void exitGame() {
        System.out.println("Do you want end this game? (Y/N)");
        String s = scanner.nextLine();
        while (true) {
            if (s.equalsIgnoreCase("Y"))
                System.exit(0);
            if (s.equalsIgnoreCase("N")) {
                return;
            }
        }
    }
    public static Player getUserName() {
        System.out.println("Enter your name: ");
        while (true) {
            String name = scanner.nextLine();
            if (name.trim().length() <= 2) {
                System.out.println("Your name is to short, please try again");
            } else
              return new Player(name);
        }
    }

    public static int getNumberOfRounds() {
        while (true) {
            try {
                System.out.println("Write how many rounds you want to play ");
                String s = scanner.nextLine();
                int games = Integer.parseInt(s);
                if (games > 0)
                    return games;
                System.out.println("Wrong move, try again");
            } catch (Exception e) {
                System.out.println("Wrong move, try again");
            }
        }
    }

    public static GameSymbols getPlayerChoice() {
        while (true) {
            System.out.println("Enter your choice: ");
            String s = scanner.nextLine();
            try {
                if (s.equalsIgnoreCase("X")) {
                    return GameSymbols.QUIT;
                } else if (s.equalsIgnoreCase("N")) {
                    return GameSymbols.RESTART;
                }
                int number = Integer.parseInt(s.substring(0, 1));
                if (number <= 5 && number > 0) {
                    if (number == 1) {
                        return GameSymbols.ROCK;
                    }
                    if (number == 2) {
                        return GameSymbols.PAPER;
                    }
                    if (number == 3) {
                        return GameSymbols.SCISSOR;
                    }
                    if (number == 4) {
                        return GameSymbols.LIZARD;
                    } else {
                        return GameSymbols.SPOKE;
                    }
                } else
                    System.out.println("Wrong move, try again");
            } catch (Exception e) {
                System.out.println("Wrong move, try again");
            }
        }
    }
}
