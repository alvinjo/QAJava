package com.qa.Garage;

public abstract class Vehicle {
	
	private String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void toggleEngine() {
		System.out.println("chugchugchug");
	}
	
	
	abstract void accelerate();
	
	
	abstract void brake();
	
	abstract int calculateCost();
		

	
	

}
