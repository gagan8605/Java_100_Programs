package com.java.progarm100;

public class StringReplace {

	public static void main(String[] args) {
		String s1="Python is Very Simple Langauge";
		String replaceS1=s1.replace("Python","Java");
		System.out.println(replaceS1);
		
		String replaceS2=s1.replace("is", "was");
		System.out.println(replaceS2);
		
		String replaceS3=s1.replaceAll("Simple", "Friendly");
		System.out.println(replaceS3);
		
	}

}
