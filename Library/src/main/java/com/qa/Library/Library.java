package com.qa.Library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class Library {

	private HashMap<Item, Person> checkOutList;
	private ArrayList<Item> itemList;
	private ArrayList<Person> registeredReaders;

	public Library() {

		checkOutList = new HashMap<>();
		itemList = new ArrayList<>();
		registeredReaders = new ArrayList<>();

	}

	public HashMap<Item, Person> getCheckOutList() {
		return checkOutList;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public ArrayList<Person> getRegisteredReaders() {
		return registeredReaders;
	}

	public void checkOut(Item item, Person person) {
		checkOutList.put(item, person);
		itemList.remove(item);
	}

	public void checkIn(Item item, Person person) {
		if (checkOutList.get(item).equals(person)) {
			checkOutList.remove(item);
			itemList.add(item);
		} else {
			System.out.println("Item: " + item.getID() + " does not belong to " + person.getName());
		}
	}

	public void add(Item item) {
		itemList.add(item);
	}

	public void remove(Item item) {
		try {
			itemList.remove(item);
		} catch (NullPointerException e) {

		} finally {
			System.out.println("Item removed: " + item.getID());
		}
	}

	public void updateItemInfo(Item item, String text) {
		try {
			itemList.get(itemList.indexOf(item)).setItemInformation(text);
		} catch (NullPointerException e) {
			System.out.println("No such person found.");
		} finally {
			System.out.println("Item information updated.");
		}
	}

	public void updateItemGroup(Item item, String group) {
		try {
			itemList.get(itemList.indexOf(item)).setGroup(group);
		} catch (NullPointerException e) {
			System.out.println("No such person found.");
		} finally {
			System.out.println("Item group updated.");
		}
	}

	public void registerPerson(Person person) {
		registeredReaders.add(person);
	}

	public void updatePerson(Person person, String name) {
		try {
			registeredReaders.get(registeredReaders.indexOf(person)).setName(name);
		} catch (NullPointerException e) {
			System.out.println("No such person found.");
			e.printStackTrace();
		} finally {
			System.out.println("Name updated: " + person.getName());
		}
	}

	public void deletePerson(Person person) {
		try {
			registeredReaders.remove(person);
		} catch (NullPointerException e) {
			System.out.println("No such person found.");
			e.printStackTrace();
		} finally {
			System.out.println(person.getName() + " removed");
		}
	}

	public void writeItemListToFile() throws IOException {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\" + "LibraryItemsList.txt"));
			writer.write(itemList.toString());
		} catch (IOException e) {
			System.out.println("Failed to write to file.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
				System.out.println("ItemList written to file.");
			}
		}

	}

}
