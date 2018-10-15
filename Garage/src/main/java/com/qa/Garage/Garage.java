package com.qa.Garage;

import java.util.ArrayList;
import java.util.Optional;

public class Garage {

	ArrayList<Vehicle> vehicleList;

	public Garage(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public int calculateBill() {
		return vehicleList.stream().map(Vehicle::calculateCost).reduce((v, m) -> v + m).get();
	}

	public void addVehicle(Vehicle v) {
		if (vehicleList == null) {
			vehicleList = new ArrayList<Vehicle>();
		}
		vehicleList.add(v);
	}

	public void addHelicopter(String name) {
		vehicleList.add(new Helicopter(name));
	}

	public void addTimeMachine(String name) {
		vehicleList.add(new TimeMachine(name));
	}

	public void emptyGarage() {
		vehicleList = null;
	}

}
