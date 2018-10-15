package com.qa.Garage;

public class Helicopter extends Vehicle{

	private int numberOfWheels = 3;
	
	
	public Helicopter(String type) {
		super("type");
	}
	
	public int getWheels() {
		return numberOfWheels;
	}
	
	public void setWheels(int num) {
		numberOfWheels = num;
	}
	
	@Override
	void accelerate() {
		System.out.println("zoom");
		
	}

	@Override
	void brake() {
		System.out.println("less zoom");
	}

	@Override
	int calculateCost() {
		return numberOfWheels*100;
	}

	
	
	
	
	
}
