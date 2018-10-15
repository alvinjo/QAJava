package com.qa.Library;

public class Book extends Item {

	public Book(String group) {
		super(group);
	}

	public void showSecurityLevel() {
		System.out.println("Public");

	}

}
