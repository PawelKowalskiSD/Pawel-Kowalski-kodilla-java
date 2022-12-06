package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(20, 10);

        int addA = calculator.add(calculator.getA(), calculator.getB());
        int subB = calculator.subtract(calculator.getA(), calculator.getB());

        if (addA == 30) {
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        if(subB == 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}