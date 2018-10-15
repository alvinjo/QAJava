package com.qa.Library;

public abstract class Item {
	
	private int itemID;
	private String group;
	private static int IDCOUNT;
	private String itemInformation;
	
	public Item(String group) {
		this.group = group;
		this.itemID = IDCOUNT++;
	}
	
	
	public int getID() {
		return itemID;
	}
	
	
	public String getGroup() {
		return group;
	}
	
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	public String getItemInformation() {
		return itemInformation;
	}
	
	
	public void setItemInformation(String info) {
		this.itemInformation = info;
	}
	
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", group=" + group + ", itemInformation=" + itemInformation + "]";
	}


	public abstract void showSecurityLevel();

}
