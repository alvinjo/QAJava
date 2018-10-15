package Inheritance;

public class MakeDog {

	public static void main(String[] args) {
		
		Pug pug = new Pug();
		
		//Methods from Pug class
		pug.breathing();
		
		//Methods inherited from Dog class
		pug.setName("groofus");
		System.out.println(pug.getName());
		pug.bark();
		pug.wagTail();
		pug.bite();
		
		//Methods inherited from Mammal class
		pug.eat();
		pug.discretelyEliminateWaste();
		System.out.println(pug.amIAlive());
		
		
	}
	
}
