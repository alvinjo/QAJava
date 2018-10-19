package com.qa.BlackJack;

import java.util.Random;

public class BlackJack {

	private int playerCard, dealerCard;
	
	public BlackJack() {
		playerCard = new Random().nextInt(52);
		dealerCard = new Random().nextInt(52);
	}
	
	public BlackJack(int playerCard, int dealerCard) {
		this.playerCard = playerCard;
		this.dealerCard = dealerCard;
	}
	
	
	
	public int compareCards() {
		if(playerCard > 21 && dealerCard > 21) {
			return 0;
		} if (playerCard > 21) {
			return dealerCard;
		} else if (dealerCard > 21) {
			return playerCard;
		} else if (playerCard == dealerCard) {
			return -1;
		}
		
		
		return playerCard > dealerCard ?  playerCard :  dealerCard;
	}
	
	
}
