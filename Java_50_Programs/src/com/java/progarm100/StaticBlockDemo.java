package com.java.progarm100;
class SBD {
    static {
        System.out.println("Static block executed.");
    }

    SBD() {
        System.out.println("Constructor executed.");
    }
}
public class StaticBlockDemo {
		    public static void main(String[] args) {
		        System.out.println("Main method starts.");
		        SBD obj = new SBD();  
		        System.out.println("Main method ends.");
		    }

}
