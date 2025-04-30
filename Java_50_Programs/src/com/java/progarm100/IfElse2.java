package com.java.progarm100;
import java.util.Scanner;
public class IfElse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Even Numbers (1-100)");
		for(i=1;i<=100;i++) {
			if(i%2==0)
				System.out.println(i);	
			else
				System.out.println("odd");
		}
	
	}

}
