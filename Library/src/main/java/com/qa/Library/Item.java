package com.qa.Library;

public abstract class Item {
	
	private int itemID;
	private String group;
	private static int IDCOUNT;
	
	public Item(String group) {
		this.group = group;
		this.itemID = IDCOUNT++;
	}
	
	public abstract void showItemInformation();
	

}
