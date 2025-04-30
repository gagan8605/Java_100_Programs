package com.java.progarm100;
class MethodDemo1 {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
}
public class MethodDemo {

	    public static void main(String[] args) {
	        // Calling static method without creating an object
	        MethodDemo1.staticMethod();
	        
	        // Creating an object to call the instance method
	        MethodDemo1 obj = new MethodDemo1();
	        obj.instanceMethod();
	    }


}
