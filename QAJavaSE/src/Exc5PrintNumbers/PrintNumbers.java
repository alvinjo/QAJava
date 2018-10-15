package Exc5PrintNumbers;

public class PrintNumbers {

	
	private static String[] UNITS = new String[] {"one","two","three","four","five",
			"six","seven","eight","nine","ten"};
	
	private static String[] TEENS = new String[] {"eleven","twelve","thirteen","fourteen","fifteen",
			"sixteen","seventeen","eighteen","nineteen"};
	
	private static String[] TENS = new String[] {"twenty","thirty","fourty","fifty",
			"sixty","seventy","eighty","nine","ten"};
	
		
	
	public static void main(String[] args) {
		print10();
		print999();
		print10Words();
		print100Words();
		print1000Words();
	}
	
	
	private static void print10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	private static void print999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
			
		}
	}
	
	
	private static void print10Words(){
		for (String word : UNITS) {
			System.out.println(word);
		}
	}
	
	
	private static void print100Words() {
		for (int i = 1; i <= 100; i++) {
			if(i == 1) {
				System.out.println("one");
			}
			if(i == 100) {
				System.out.println("one hundred");
			}
			
			System.out.println(i);
		}
	}
	
	
	private static void print1000Words() {
		String number;
		for (int i = 1; i <= 1000; i++) {
			
			number = i+"";
			
			if(number.length() == 1) {
				System.out.println(UNITS[number.charAt(0)-1]);
			}
			
			if(number.length() == 2) {
				System.out.println(TEENS[number.charAt(1)-1]);
			}
			
			if(number.length() == 3) {
				System.out.println(UNITS[number.charAt(0)-1]);
			}
			
			System.out.println(TENS);
		}
	}

	
}
