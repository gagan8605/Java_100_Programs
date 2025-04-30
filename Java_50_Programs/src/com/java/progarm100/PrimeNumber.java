package com.java.progarm100;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A  Number You want print Print Up to :");
        int n =sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        for (int num = 2; num <=n; num++) {
            boolean isPrime = true;
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num);
            }
        }

	}

}
