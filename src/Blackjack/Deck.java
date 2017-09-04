package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private static ArrayList<Card> deck;
	
	Deck(int numOfDecks){
	    deck = new ArrayList<Card>();
	    for(int k=0; k<numOfDecks; k++) {
	    		for(int i=1; i<=4; i++){
	    			for(int j=1; j<=13; j++){
	    				deck.add(new Card(i,j));
	    			}
	    		}
	    }
	}
	
	void shuffle() {
		Collections.shuffle(deck);
	}
	
	public static Card drawCard() {
		return deck.remove(0);
	}

}
