package com.qa.Person;

import java.util.Random;

public class Trainer extends Person {

	private static int idsMade;
	private int trainerID;

	public Trainer(String name) {
		this.setName(name);
		this.trainerID = generateTrainerID();
	}

	private static int generateTrainerID() {
		return idsMade++;
	}

	public void teach() {
		int n = new Random().nextInt(3);
		switch (n) {
		case (0):
			System.out.println("Don't use scanners");
			break;
		case (1):
			System.out.println("Java");
			break;
		case (2):
			System.out.println("Programming");
			break;
		default: break;
				
		}

	}

	@Override
	public String toString() {
		return "Trainer [trainerID=" + trainerID + "]";
	}
	
	

}
