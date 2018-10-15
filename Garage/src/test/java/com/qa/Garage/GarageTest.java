package com.qa.Garage;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class GarageTest {
	Helicopter heli;
	TimeMachine tardis;
	Garage garage;
	
	
	@Before
	public void setup(){
		heli = new Helicopter("heli");
		tardis = new TimeMachine("tardis");
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(heli);
		vehicleList.add(tardis);
		garage = new Garage(vehicleList);
	}
	
	
	@Test
	public void testCalculateBill() {
		assertEquals(1300, garage.calculateBill());
		
	}
	

}
