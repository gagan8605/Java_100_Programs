package com.java.progarm100;
import java.util.Scanner;
public class Add2Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a First Number a:");
		a=sc.nextInt();
		
		System.out.println("Enter a Second Number b:");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Addition of a and b is :"+c);
	}

}
