package com.qa.Garage;

import java.util.ArrayList;

public class Runner {

	
	public static void main(String[] args) {
		
		TimeMachine tm = new TimeMachine("Tardis");
		Helicopter heli = new Helicopter("Apache");
		TimeMachine lewis = new TimeMachine("Time Turner");
		
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		vehicleList.add(tm);
		vehicleList.add(heli);
		vehicleList.add(lewis);
		
		Garage gg = new Garage(vehicleList);
		gg.calculateBill();
		
	}
	
}
