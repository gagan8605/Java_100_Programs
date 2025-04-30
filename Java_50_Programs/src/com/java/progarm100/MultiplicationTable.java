package com.java.progarm100;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number :");
		int n = sc.nextInt();
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}

}
