package com.qa.BlackJack;

import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {
	
	
	@Test
	public void testCompareCards() {
		BlackJack game = new BlackJack(21,22);
		assertEquals(21, game.compareCards());
		
		game = new BlackJack(25,22);
		assertEquals(0, game.compareCards());
	}

}
