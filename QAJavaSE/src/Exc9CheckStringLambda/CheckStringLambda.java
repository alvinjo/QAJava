package Exc9CheckStringLambda;

import java.util.function.BiPredicate;

public class CheckStringLambda {
	
	
	public static void main(String[] args) {
		
		BiPredicate<String, String> check = ((s,t) ->  s.equals(t));
		System.out.println(check.test("hello", "hello"));
		
	}


}
