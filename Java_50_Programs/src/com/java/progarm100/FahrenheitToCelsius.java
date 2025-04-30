package com.java.progarm100;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
    	System.out.println("Enter Temperature In Fahrenheit(°F):");
    	int temp=sn.nextInt();
    	
    	System.out.println("Temperature In Celsius");
    	 double celTemp=(temp-32)*5/9;
    	 System.out.println(temp+"°F :"+celTemp+"°C");
    	
    	
    	
      }
  
}
