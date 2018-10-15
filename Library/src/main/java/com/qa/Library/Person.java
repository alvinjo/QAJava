package com.qa.Library;

import java.util.ArrayList;

public class Person {

	private int PID;
	private String name;
	private ArrayList<Item> itemsCheckedOut;
	static int IDCOUNT;
	
	
	public Person(String name) {
		this.name = name;
		itemsCheckedOut = new ArrayList<Item>(); //instantiate only when checking out?
		PID = IDCOUNT++;
	}
	
	
	public ArrayList<Item> getItemsCheckedOut() {
		return itemsCheckedOut;
	}
	
	
	
	
}
