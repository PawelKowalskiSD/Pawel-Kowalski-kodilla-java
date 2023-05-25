package com.kodilla.tasks;

/*
Dane są dwie zmienne: a o wartości 5, b o wartości 7.
Napisz program, który podmieni te dwie wartości miejscami tak, żeby w zmiennej a znajdowała się wartość 7, a w zmiennej b wartość 5.
Nie należy ograniczać się do wartości 5 i 7, program powinien obsługiwać liczby całkowite większe lub równe 0 (zbiór liczb naturalnych).
**UWAGA: ** W programie możesz stworzyć tylko i wyłącznie te dwie zmienne (nie możesz tworzyć nowych zmiennych).
*/
public class SwappingNumbers {

    public static void swapNumber(int a, int b) {
        try {
            if (a >= 0 && b >= 0) {
                System.out.println("your input: a = " + a + " b = " + b);
                a -= b;
                b += a;
                a = b - a;
            }
            System.out.println("your output: a = " + a + " b = " + b);
            if (a < 0 || b < 0)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("input must be positive number");
        }
    }
}
