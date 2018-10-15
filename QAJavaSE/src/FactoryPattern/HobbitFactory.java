package FactoryPattern;

public class HobbitFactory {
	
	
	
	
	public static void main(String[] args) {
		Hobbit hobbit = new HobbitFactory().makeHobbit("hobbit");
	
	}
	
	
	
	public Hobbit makeHobbit(String type) {
		
		if (type.equals("gollum")) {
			return new Gollum();
		}else if(type.equals("baggins")) {
			return new Baggins();
		}
		
		return null;
	}
	

}
