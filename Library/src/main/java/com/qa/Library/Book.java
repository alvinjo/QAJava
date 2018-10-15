package com.qa.Library;

public class Book extends Item{

	
	public Book(String group) {
		super(group);
	}
	
	
	@Override
	public void showItemInformation() {
		System.out.println("Books and such");
		
	}

	
	
}
