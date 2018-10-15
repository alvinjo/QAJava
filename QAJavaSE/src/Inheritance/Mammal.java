package Inheritance;

public class Mammal {
	
	private boolean alive;
	
	
	public Mammal() {
		alive = true;
	}
	
	public void eat() {
		System.out.println("nomnom");
	}
	
	public void discretelyEliminateWaste() {
		System.out.println("feelsgood");
	}
	
	public boolean amIAlive() {
		return alive;
	}
	
}
