package Blackjack;

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> hand;
	private int aceCounter = 0;
	private int handValue;
	
	void addCard(){
		Card newCard = Deck.drawCard();
		if(newCard.rank.equals(Card.Rank.ACE)) {
			aceCounter++;
		}
		handValue += newCard.getValue();
		hand.add(newCard);
	}
	
	void hit() {
		addCard();
	}
	
	int getHandValue() {
		if(this.aceCounter > 0 && handValue > 21) {
			this.aceCounter--;
			return handValue-10;
		}
		else {
			return this.handValue;
		}
	}
	
	boolean isBust() {
		return (getHandValue()>21);
	}
}
