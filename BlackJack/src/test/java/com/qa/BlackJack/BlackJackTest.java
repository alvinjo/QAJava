package com.qa.BlackJack;

import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {
	
	
	@Test
	public void testCompareCards() {
		
		BlackJack game = new BlackJack(21,22);
		assertEquals(21, game.compareCards());
		
		game = new BlackJack(23,10);
		assertEquals(10, game.compareCards());
		
		game = new BlackJack(25,22);
		assertEquals(0, game.compareCards());
		
		game = new BlackJack(10,18);
		assertEquals(18, game.compareCards());
		
		game = new BlackJack(18,12);
		assertEquals(18, game.compareCards());
		
		game = new BlackJack(17,17);
		assertEquals(-1, game.compareCards());
		
	}

}
