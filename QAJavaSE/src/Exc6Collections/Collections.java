package Exc6Collections;

import java.util.ArrayList;

public class Collections {
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		storeTen();
		storeHundred();
		
	}
	
	private static void storeTen() {
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i]=i+1;
		}
	}
	
	private static void storeHundred() {
		for (int i = 100; i <= 999; i++) {
			list.add(i);
		}
		System.out.println("# " + list.toString());
		multiplyList(list);
	}
	
	private static void multiplyList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)*10);
		}
		System.out.println("## " + list.toString());
	}
	
	
}
