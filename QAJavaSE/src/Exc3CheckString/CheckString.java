package Exc3CheckString;

public class CheckString {

	public static void main(String[] args) {
		System.out.println(isThisHello("Hollo"));
		System.out.println(isThisHello("Hello"));

		System.out.println(stringEquals("world", "World"));
		System.out.println(stringEquals("World", "World"));
	}

	private static boolean isThisHello(String word) {
		return word == "Hello";
	}

	private static boolean stringEquals(String word1, String word2) {
		return word1 == word2;
	}

}
