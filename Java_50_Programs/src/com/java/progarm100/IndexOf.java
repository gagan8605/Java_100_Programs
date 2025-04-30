package com.java.progarm100;

public class IndexOf {

	public static void main(String[] args) {
		String s1="Java is Platform Independent Language";
		int index1=s1.indexOf(4);
		System.out.println("Index 1:"+index1);
		
		int index2 =s1.indexOf("Inde");
		System.out.println("Index 2:"+index2);
		
	   int index3=	s1.indexOf("is",4);
	   System.out.println("Index 3:"+index3);
	   
		

	}

}
