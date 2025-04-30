package com.java.progarm100;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Let's Check Your Class You Get");
		System.out.println("Enter Your Marks You Obtain:");
		int marks=sc.nextInt();
		if(marks>=60) {
			if(marks>=65 && marks <75) {
				System.out.println("You are Selected For Class D");
				
			}else if(marks >=75 && marks <85) {
				System.out.println("You are Selected For Class C");
			}else if(marks >=85 && marks <95) {
				System.out.println("You are Selected For Class B");
			}else if(marks >=95 && marks <=100){
				System.out.println("Congratulations !! You are Selected For Class A ");
			}else {
				System.err.println("Please Enter Valid Marks ");
			}
		}else {
			System.out.println("Better Luck Next Time ! Try To get More Marks  ");
		}
	}

}
