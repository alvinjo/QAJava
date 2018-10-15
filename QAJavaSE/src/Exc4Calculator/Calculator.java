package Exc4Calculator;

import Exc10CalculatorLambda.CalculatorLambda;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println(performOperation(5, 2, "addition"));
		System.out.println(performOperation(5, 2, "subtract"));
		System.out.println(performOperation(5, 2, "multiply"));
		System.out.println(performOperation(5, 2, "divide"));
		
		
	}

	
	private static double performOperation(int val1, int val2, String operation) {
		double num1 = val1;
		double num2 = val2;
		
		switch (operation) {
			case "add":
			case "addition":
				return num1+num2;
			case "subtract":
			case "subtraction":
				return num1-num2;
			case "multiply":
			case "multiplication":
				return num1*num2;
			case "divide":
			case "division":
				return num1/num2;
			default :
				System.out.println("Invalid Input");
				return 0;
				
		}	
		
	}
	
}
