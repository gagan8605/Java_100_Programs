package com.java.progarm100;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Non-Neagtive Number To find Its Factorial:");
		int num =sc.nextInt();
		int i,fact=1;
		for(i=1;i <=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial Of "+num+" is "+fact);
	}

}
