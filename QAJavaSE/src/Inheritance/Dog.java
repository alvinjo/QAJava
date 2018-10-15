package Inheritance;

public class Dog extends Mammal{
	
	private String name;
	private int age;
	
	
	public Dog() {
		name = "roofus";
		age = 1;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void bark() {
		System.out.println("bark");
	}
	
	public void wagTail() {
		System.out.println("wag");
	}
	
	public void bite() {
		System.out.println("bite");
	}

}
