package com.core.java;

import java.util.Scanner;

public class Machin {

	public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (either +, -, * or /): ");

        // ask user to enter operator
        operator = scanner.next().charAt(0);
        System.out.print("Enter number1 and number2 respectively: ");

        // ask user to enter numbers
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
             
             
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;
                
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;
                
                
}
}
}
	
	