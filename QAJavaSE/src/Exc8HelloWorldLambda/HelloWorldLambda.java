package Exc8HelloWorldLambda;

import java.util.function.Consumer;

public class HelloWorldLambda {

	
	public static void main(String[] args) {
		
		
		Consumer<String> hello = (s -> System.out.println(s));
		hello.accept("t");
		
		
	}
	
	
}
