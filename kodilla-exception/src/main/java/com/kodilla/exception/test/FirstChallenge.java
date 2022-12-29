package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero: ");
        } finally {
            System.out.println("done");
        }

        return a / b;
    }

    public int exponentiation(int a , int n)  {
        int sum = 1;
            while(n != 0) {
                sum *= a;
                n--;
            }
        return sum;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        int exponentiationOfZero = firstChallenge.exponentiation(0,2);
        int exponentiationOfANumberWithZero = firstChallenge.exponentiation(2,0);
        int exponentiationOfANumberWithOne = firstChallenge.exponentiation(4,4);

        System.out.println(result);

        System.out.println(exponentiationOfZero);
        System.out.println(exponentiationOfANumberWithZero);
        System.out.println(exponentiationOfANumberWithOne);

    }
}
