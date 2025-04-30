package com.java.progarm100;

import java.util.Scanner;

public class Swap2NumUsing2Var {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number x and y:");
		int x =sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Before Swaping");
		System.out.println("x:"+x+"\ny:"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swaping");
		System.out.println("x:"+x+"\ny:"+y);
//-------------------OR--------------------------
		System.out.println("-----------------------------------");
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("After Swaping");
		System.out.println("x:"+x+"\ny:"+y);
	}

}
