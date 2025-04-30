package com.java.progarm100;

public class CommandLineArg {

	public static void main(String[] args) {
		 int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);
         int sum = num1 + num2;
         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
         //Output:The sum of 10 and 20 is: 30

	}
     
}
/*
 * Command-line arguments are the arguments or parameters that you pass to 
 * a Java program when you execute it from the command line. 
 * These arguments are passed to the main() method of the program as an array of String objects.
 * 
 */
