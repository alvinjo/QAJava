package com.qa.Library;

import static org.junit.Assert.*;

import org.junit.*;

public class LibraryTest {
	PublicReader don;
	Library lib;
	Book book;

	@Before
	public void setup() {
		lib = new Library();
		don = new PublicReader("don");
		book = new Book("education");
	}

	@Test
	public void testCheckOut() {
		lib.registerPerson(don);
		lib.add(book);
		lib.checkOut(book, don);
		assertEquals(lib.getCheckOutList().get(book), don);
	}

	@Test
	public void testCheckIn() {
		testCheckOut();
		lib.checkIn(book, don);
		assertFalse(lib.getCheckOutList().containsKey(book));
	}

	@Test
	public void testAdd() {
		lib.add(book);
		assertTrue(lib.getItemList().contains(book));
	}

	@Test
	public void testRemove() {
		testAdd();
		lib.remove(book);
		assertFalse(lib.getCheckOutList().containsKey(book));
	}

	@Test
	public void testUpdateItemInfo() {
		testAdd();
		lib.updateItemInfo(book, "updated text");
		assertEquals(lib.getItemList().get(0).getItemInformation(), "updated text");
	}

	@Test
	public void testRegisterPerson() {
		don = new PublicReader("don");
		lib.registerPerson(don);
		assertTrue(lib.getRegisteredReaders().contains(don));
	}

	@Test
	public void testUpdatePerson() {
		testRegisterPerson();
		lib.updatePerson(don, "luther");
		assertEquals("luther", lib.getRegisteredReaders().get(0).getName());
	}

	@Test
	public void testDeletePerson() {
		testAdd();
		lib.remove(book);
		assertFalse(lib.getItemList().contains(book));
	}

}
