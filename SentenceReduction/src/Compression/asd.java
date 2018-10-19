package Compression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class asd {

	static ArrayList<String> letters = new ArrayList<>();
	static String newText = "";
	static HashMap<String, String> asd = new HashMap<>();

	public static void main(String[] args) {

		letters.add("A");

		asd.put(".-", "a");
		asd.put("-...", "b");
		asd.put("-.-.", "c");
		asd.put("-..", "d");
		asd.put(".", "e");
		asd.put("..-.", "f");
		asd.put("--.", "g");
		asd.put("....", "h");
		asd.put("..", "i");
		asd.put(".---", "j");
		asd.put("-.-", "k");
		asd.put(".-..", "l");
		asd.put("--", "m");
		asd.put("-.", "n");
		asd.put("---", "o");
		asd.put(".--.", "p");
		asd.put("--.- ", "q");
		asd.put(".-.", "r");
		asd.put("...", "s");
		asd.put("-", "t");
		asd.put("..-", "u");
		asd.put("...-", "v");
		asd.put(".--", "w");
		asd.put("-..-", "x");
		asd.put("-.--", "y");
		asd.put("--..", "z");
		

		String text = "... / --- / ...";
		String texttext = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--​";

		decrypt(texttext);
		
	}

	public static void decrypt(String text) {

		String[] text1 = text.split(" ");

		try {
			for (String letter : text1) {
				if (letter.equals("/")) {
					newText += " ";
				} else {
					newText += asd.get(letter);
				}

			}
		} catch (NullPointerException e) {

		}

		System.out.println(newText);
	}

}
