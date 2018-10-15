package Exc10CalculatorLambda;

import java.util.function.BiFunction;

public class CalculatorLambda {
	
	public static MathOperation add = (a,b) -> a+b;
	public static MathOperation subtract = (a,b) -> a-b;
	public static MathOperation divide = (a,b) -> a/b;
	public static MathOperation multiply = (a,b) -> a*b;

	
	
	public static void main(String[] args) {
		calculate(add, 1, 2);
	}
	
	
	public static int calculate(MathOperation f, Integer a, Integer b) {
		return f.operate(a, b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//#####other method
	
	public static void toOperate() {
		BiFunction<Integer,Integer,Integer> f = null;
		
		Integer result = operate((n, m) -> n + m, 6, 3, "add");
		System.out.println(result);
		result = operate(f, 6, 3, "subtract");
		System.out.println(result);
		result = operate(f, 6, 3, "divide");
		System.out.println(result);
		result = operate(f, 6, 3, "multiply");
		System.out.println(result);
	}
	
	
	
	public static Integer operate(BiFunction<Integer, Integer, Integer> f, Integer n, Integer m, String op) {
		
		switch (op) {
			case "add":
				f = (a, b) -> a + b;
				break;
			case "subtract":
				f = (a, b) -> a - b;
				break;
			case "divide":
				f = (a, b) -> a / b;
				break;
			case "multiply":
				f = (a, b) -> a * b;
				break;
		}

		return f.apply(n, m);

	}

	/*
	 * @Override public Object apply(Object arg0, Object arg1) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
