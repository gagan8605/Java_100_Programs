package com.java.progarm100;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A First String :");
		String s1 =sc.nextLine();
		
		System.out.println("Enter A Second String:");
		String s2=sc.nextLine();
		
		if(s1.compareTo(s2)>0) {
			System.out.println("First string Is Greater Than Second String");
		}else if(s1.compareTo(s2)<0) {
			System.out.println("Fisrt String Is Smaller Than Second String");
		}else {
			System.out.println("Both String Are equal");
		}
	}
	/*
	 * The compareTo() method in Java is used to compare two strings lexicographically (based on their Unicode values).
	 */
	

}
