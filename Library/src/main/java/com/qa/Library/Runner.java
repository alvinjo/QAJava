package com.qa.Library;

import java.io.IOException;

public class Runner {

	
	public static void main(String[] args) {
		
		Library lib = new Library();
		lib.add(new Book("Prince"));
		lib.add(new Book("Java 10"));
		
		
		try {
			lib.writeItemListToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
