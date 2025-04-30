package com.java.progarm100;
import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome ! Please Enter Your Details Below .");
		System.out.println("Enter Your Name:");
		String name =sc.next();
		
		System.out.println("Enter Your Age:");
		int age =sc.nextInt();
		
		System.out.println("Enter Your Mobile Number :");
		long mobileNum =sc.nextLong();
		
		System.out.println("Enter Your class Number(1-100):");
		byte classNum=sc.nextByte();
		
		System.out.println("Enter Your Height(in inch):");
		double height =sc.nextDouble();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Mobile Number:"+mobileNum);
		System.out.println("Class Number:"+classNum);
		System.out.println("Height:"+2.54*height+" cm");
	}

}
