package com.kodilla.rps.ui;

import com.kodilla.rps.logic.Board;
import com.kodilla.rps.logic.Select;

import java.util.Scanner;

import static java.lang.System.in;

public class UserDialogs {
    public static Select getNextMove(Board board) {
        Scanner scanner = new Scanner(in);
        while (true) {
            display();
            board.count(board);
            String s = scanner.nextLine();
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
        Scanner scanner = new Scanner(in);

        System.out.println("Start Game");
        System.out.println("Write your name:");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Write how many times you want to play ");

        String s = scanner.nextLine();
        int games = Integer.parseInt(s);
        board.setNumberOfGames(games);
    }

    private static void restartGame(String s) {
        if (s.equalsIgnoreCase("Y"))

        if (s.equalsIgnoreCase("N"))
            display();
    }

    private static String question(Scanner scanner) {
        String s;
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
}
