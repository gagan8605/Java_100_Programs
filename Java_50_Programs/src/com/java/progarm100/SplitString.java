package com.java.progarm100;

public class SplitString {

	public static void main(String[] args) {
		String s1="Pune District Education Association's";
		String[] splits1=s1.split("\\p{Upper}");//A Upper-case alphabetic character: [A-Z]
		for(String w:splits1) {
			System.out.println(w);
		}
		
	}

}
