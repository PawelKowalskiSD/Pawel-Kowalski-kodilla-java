package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println();
        System.out.println("Fun with text");
        System.out.println("====================" + "\n");
        System.out.println(poemBeautifier.beautify("HELLO WORLD", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("This is my firs text", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("I like potato", text -> text.concat("s")));
        System.out.println(poemBeautifier.beautify("text", text -> text.replace("t", "n").substring(0, 3) + "t to"));
        System.out.println(poemBeautifier.beautify("This is my car", text -> text.substring(0, 11) + "house"));
        System.out.println(poemBeautifier.beautify("My favorite colour is red", text -> text.substring(0, 0) + "--> " + text.concat(" <--")));
    }
}



