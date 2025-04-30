package com.java.progarm100;

public class FinallyKeyword {
    void divideNumbers(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block is always executed.");
        }
    }

    public static void main(String[] args) {
    	FinallyKeyword fk = new FinallyKeyword();
        fk.divideNumbers(10, 2);  // No exception
        fk.divideNumbers(10, 0);  // Exception occurs
    }
}
