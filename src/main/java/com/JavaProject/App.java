package com.JavaProject;

public class App

{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int product = multiplyNumbers(num1, num2);
        int difference = subtractNumbers(num1, num2);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + difference);
    }
    public static int multiplyNumbers( int numberOne, int numberTwo ) 
    {
   
       
    	return numberOne * numberTwo;
    }
    public static int subtractNumbers( int numberOne, int numberTwo )
    {
        return numberOne - numberTwo;
    }
}

