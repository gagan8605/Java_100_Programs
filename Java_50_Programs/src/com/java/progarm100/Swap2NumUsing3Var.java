package com.java.progarm100;
import java.util.Scanner;
public class Swap2NumUsing3Var {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number a and b:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before Swaping");
		System.out.println("a:"+a+"\nb:"+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping");
		System.out.println("a:"+a+"\nb:"+b);
	}
}
