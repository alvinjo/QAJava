package Exc1HelloWorld;

import java.util.function.Consumer;

public class HelloWorld {
	
	public static void main(String[] args) {
		printHelloWorld();
		System.out.println(giveHelloWorld());
		printString("WorldHello");
	}
	
	
	private static void printHelloWorld() {
		System.out.println("HelloWorld");
	}
	
	public static String giveHelloWorld() {
		return "HelloWorld";
	}
	
	
	public static void printString(String text) {
		System.out.println(text);
	}
	
	

}
