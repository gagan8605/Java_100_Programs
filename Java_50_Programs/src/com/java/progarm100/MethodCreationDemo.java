package com.java.progarm100;

public class MethodCreationDemo {
    void add(int a , int b) {
    	System.out.println("Addition of a and b is:"+(a+b));
    }
    
    int sub(int x,int y) {
    	return x-y;
    }
	public static void main(String[] args) {
		MethodCreationDemo ob = new MethodCreationDemo();
		ob.add(5, 20);
		int result =ob.sub(5, 3);
		System.out.println("Substraction Of x And y is :"+result);

	}

}
