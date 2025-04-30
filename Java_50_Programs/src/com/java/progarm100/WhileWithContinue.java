package com.java.progarm100;

public class WhileWithContinue {

	public static void main(String[] args) {
		int n=1;
		while(n<=20) {
			
			if (n==10) {
			    n++;
                continue;
			 
				}
			if(n==18) {
				break;
			}
			System.out.println(n);
			n++;
			}

	}

}
