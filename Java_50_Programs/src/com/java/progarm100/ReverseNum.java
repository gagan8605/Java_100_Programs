package com.java.progarm100;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
        int num = sc.nextInt();
        int reverse = 0;
        while(num !=0) {
        	  reverse = reverse * 10 + num % 10;
        	  num = num / 10;
        }
        System.out.println("Revrese Number is :"+reverse);
	}

}
