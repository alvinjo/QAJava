package FactoryPattern;

public class Gollum extends Hobbit{

	
	boolean hasRing;
	
	public Gollum() {
		this.stomachCapacity = 200;
	}
	
	
	
	public String screech() {
		return "BAAGGINSS";
	}
	
	
	public void getRing() {
		hasRing = true;
	}
	
	public boolean hasRing() {
		return hasRing;
	}
	
}
