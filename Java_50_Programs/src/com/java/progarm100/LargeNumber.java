package com.java.progarm100;
import java.util.Scanner;
public class LargeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter Any Three Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ( a > b && a > c )
		System.out.println("First number is largest. "+a);
		else if ( b > a && b > c )
		System.out.println("Second number is largest. "+b);
		else if ( c > a && c > b )
		System.out.println("Third number is largest. "+c);
		else
		System.out.println("Entered numbers are not distinct.");
        
		}

	}


