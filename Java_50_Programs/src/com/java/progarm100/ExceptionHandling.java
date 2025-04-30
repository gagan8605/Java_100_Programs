package com.java.progarm100;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Two Number :");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
	}

}
