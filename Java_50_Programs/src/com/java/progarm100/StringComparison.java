package com.java.progarm100;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String :");
		String s1=sc.next();
		
		System.out.println("Enter a Second String :");
		String s2=sc.next();
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Both the String are Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	}

}
