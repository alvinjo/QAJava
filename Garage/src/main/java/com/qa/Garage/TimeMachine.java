package com.qa.Garage;

public class TimeMachine extends Vehicle{

	private int numOfEngines = 100;
	
	public TimeMachine(String name) {
		super(name);
	}

	@Override
	void accelerate() {
		System.out.println("moving through time");
	}

	@Override
	void brake() {
		System.out.println("stop moving through time");
	}

	@Override
	int calculateCost() {
		return numOfEngines*10;
	}
	
}
