package com.qa.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	
	public static void main(String[] args) {
		Trainer trainer = new Trainer("don");
		Trainer trainer1 = new Trainer("jon");
		Delegate delegate = new Delegate("tob");

		System.out.println(trainer.getName());
		trainer.teach();
		
		System.out.println(delegate.getName());
		delegate.changeStream();
		
		System.out.println(trainer.toString());
		System.out.println(trainer1.toString());
		System.out.println(delegate.toString());
		
		
		ArrayList<Person> peopleList = new ArrayList<Person>();
		peopleList.add(trainer);
		peopleList.add(trainer1);
		peopleList.add(delegate);
		
		System.out.println("Stream output");
		peopleList.stream().filter(p -> p.getClass() == Trainer.class).forEach(System.out::println);
		
		System.out.println("toString");
		System.out.println(trainer.toString());
		System.out.println(delegate.toString());
		
		System.out.println("search by name");
		List<Person> searchList = peopleList.stream().filter(p -> p.getName()=="tob").collect(Collectors.toList());
		System.out.println(searchList.toString());
		
		
		
		PersonManager manager = new PersonManager(peopleList);
		System.out.println(manager.find("don"));
		
	}
	
}
