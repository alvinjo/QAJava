package com.qa.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {
	
	ArrayList<Person> pList;


	public PersonManager(ArrayList<Person> peopleList) {
		this.pList = pList;
	}



	public List<Person> find(String name) {
		List<Person> searchList = pList.stream().filter(p -> p.getName()==name).collect(Collectors.toList());
		return searchList;
	}


	
}
