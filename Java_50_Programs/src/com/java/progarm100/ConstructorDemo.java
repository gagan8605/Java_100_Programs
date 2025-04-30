package com.java.progarm100;
class Calculator{
	int num1, num2;

    Calculator(int a) {
        num1 = a;
        num2 = 0;
    }

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void display() {
        System.out.println("Num1: " + num1 + ", Num2: " + num2);
    }
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator(5);
        Calculator calc2 = new Calculator(5, 10);

        calc1.display();
        calc2.display();

	}

}
