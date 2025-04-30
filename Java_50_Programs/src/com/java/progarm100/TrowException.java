package com.java.progarm100;
 public class TrowException {
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18, cannot proceed");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        TrowException te = new TrowException();

        try {
            te.checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            te.checkAge(20);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

