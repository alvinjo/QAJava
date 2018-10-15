package Exc2Calculator;

public class Calculator {
	
	
	public static void main(String[] args) {
/*		System.out.println("Select Operation:");
		System.out.println("Add(1), Subtract(2), Multiply(3), Divide(4)");
		String userIn = System.console().readLine();
		int input = Integer.parseInt(userIn);
		int[] values;
		switch (input) {
		case 1: 
			values = enterValues();
			System.out.println(add(values[0],values[1]));
		case 2: 
			values = enterValues();
			System.out.println(subtract(values[0],values[1]));
		case 3: 
			values = enterValues();
			System.out.println(multiply(values[0],values[1]));
		case 4: 
			values = enterValues();
			System.out.println(divide(values[0],values[1]));
			
		}
			*/
		
		
		
		System.out.println(add(5,2));
		
		System.out.println(subtract(5,2));
		
		System.out.println(multiply(5,2));
		
		System.out.println(divide(5,2));
		
	}
	
	private static int[] enterValues() {
		int[] values = new int[2];
		System.out.println("Enter val1: ");
		values[0] = Integer.parseInt(System.console().readLine());

		System.out.println("Enter val2: ");
		values[1] = Integer.parseInt(System.console().readLine());
		
		return values;
	}
	
	private static int add(int val1, int val2) {
		return val1 + val2;
	}
	
	private static int subtract(int val1, int val2) {
		return val1-val2;
	}
	
	private static int multiply(int val1, int val2) {
		return val1*val2;
	}
	
	private static double divide(int val1, int val2) {
		double newVal1, newVal2;
		newVal1 = val1;
		newVal2 = val2;
		return newVal1/newVal2;
	}
	
	
	
	

}
