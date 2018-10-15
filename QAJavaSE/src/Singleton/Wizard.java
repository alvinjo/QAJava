package Singleton;

public class Wizard {
	
	private static Wizard[] wizards = new Wizard[5];
	
	private Wizard() {}
	
	
	public static Wizard getInstance() {
		
		for (int i = 0; i < wizards.length; i++) {
			if (wizards[i] != null) {
				return wizards[i];
			}
		}
		wizards[0] = new Wizard();
		return wizards[0];
	}
	
	public static Wizard makeInstance() {
		for (int i = 0; i < wizards.length; i++) {
			if (wizards[i] == null) {
				wizards[i] = new Wizard();
				return wizards[i];
			}
		}
		return null;
	}
	
	

}
