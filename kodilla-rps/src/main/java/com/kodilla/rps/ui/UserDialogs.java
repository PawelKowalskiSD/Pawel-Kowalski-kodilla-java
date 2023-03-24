package com.kodilla.rps.ui;

import com.kodilla.rps.logic.Board;
import com.kodilla.rps.logic.Select;
import com.kodilla.rps.logic.Symbols;

import java.util.Scanner;


public class UserDialogs {
    static Scanner scanner = new Scanner(System.in);
    static String name;

    static String s;

    static boolean end = false;
    public static Select getNextMove(Board board) {

        while (true) {
            display();
            count(board);
            s = scanner.nextLine();
            try {
                if (s.equalsIgnoreCase("X")) {
                    s = question(scanner);
                    exitGame(s);
                } else if (s.equalsIgnoreCase("N")) {
                    s = question(scanner);
                    restartGame(s);
                }
                    int move = Integer.parseInt(s.substring(0, 1));
                    if (move > 5 || move <= 0 && scanner.hasNextLine())
                        throw new Exception();
            } catch (Exception e) {
                System.out.println("Wrong move, try again");
            }
        }
    }

    public static void introduction(Board board) {

        System.out.println("Start Game");
        System.out.println("Write your name:");

        name = scanner.nextLine();

        System.out.println("Hello " + name);

        try {
            System.out.println("Write how many times you want to play ");
            s = scanner.nextLine();
            int games = Integer.parseInt(s);
            board.setNumberOfGames(games);
            if(games < 0)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("Wrong move, try again");
        }
    }

    private static void count(Board board) {
        int sum = 1;
        while (board.getNumberOfGames() >= sum) {
            System.out.println("Round: " + sum);
            choice();

            sum++;
        }
        if(sum == board.getNumberOfGames()) {
            end = true;
        }
    }

    private static void choice() {
        s = scanner.nextLine();
        int number = Integer.parseInt(s);
        possibleChoice(number);

    }

    private static void possibleChoice(int number) {
        if (number == 1) {
            System.out.println(Symbols.getRock());
        }
        if (number == 2) {
            System.out.println(Symbols.getPaper());
        }
        if (number == 3) {
            System.out.println(Symbols.getScissor());
        }
        if (number == 4) {
            System.out.println(Symbols.getLizard());
        }
        if (number == 5) {
            System.out.println(Symbols.getSpoke());
        }
    }

    private static void restartGame(String s) {
        if (s.equalsIgnoreCase("Y"))

        if (s.equalsIgnoreCase("N"))
            display();
    }

    private static String question(Scanner scanner) {
        System.out.println("Do you want end this game? (Y/N)");
        s = scanner.nextLine();
        return s;
    }

    private static void exitGame(String s) {
        if (s.equalsIgnoreCase("Y"))
            System.exit(0);
        if (s.equalsIgnoreCase("N"))
            display();
    }

    private static void display() {
        System.out.println("Press (1 - Rock)");
        System.out.println("Press (2 - Paper)");
        System.out.println("Press (3 - Scissor)");
        System.out.println("Press (4 - Lizard)");
        System.out.println("Press (5 - Spoke)");
        System.out.println("Press (X - quit Game)");
        System.out.println("Press (N - New game)");
    }

    public static boolean select() {
//        boolean result;
//            System.out.println(Symbols.getRock());
//            result = true;
        return true;
    }
}
