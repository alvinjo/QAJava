package com.qa.Person;

public class Delegate extends Person {
	
	private static int idsMade;
	
	private int softSkill, techSkill, attitude;
	private int ID;
	
	
	public Delegate(String name) {
		this.setName(name);
		this.ID = generateID();
	}
	
	
	private static int generateID() {
		return idsMade++;
	}
	
	
	public void changeStream() {
		System.out.println("Stream changed");
	}
	
	public int getSoftSkill() {
		return softSkill;
	}
	
	public int getTechSkill() {
		return techSkill;
	}
	
	public int getAttitude() {
		return attitude;
	}
	
	public void setSoftSkill(int level) {
		this.softSkill = level;
	}
	
	public void setTechSkill(int level) {
		this.techSkill = level;
	}
	
	public void setAttitude(int level) {
		this.attitude = level;
	}


	@Override
	public String toString() {
		return "Delegate [name=" + getName() + ", softSkill=" + softSkill + ", techSkill=" + techSkill + ", attitude=" + attitude + ", ID=" + ID
				+ "]";
	}
	
	
	
	
	
	
}
