package Blackjack;

public class Card {
	Rank rank;
	Suit suit;
	
	enum Rank {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
	
	enum Suit {
	    CLUBS,
	    DIAMONDS,
	    HEARTS,
	    SPADES
	}
	
	Card(int i, int j){
		switch(i) {
		case 1:
			this.rank = Rank.ACE;
		case 2:
			this.rank = Rank.TWO;
		case 3:
			this.rank = Rank.THREE;
		case 4:
			this.rank = Rank.FOUR;
		case 5:
			this.rank = Rank.FIVE;
		case 6:
			this.rank = Rank.SIX;
		case 7:
			this.rank = Rank.SEVEN;
		case 8:
			this.rank = Rank.EIGHT;
		case 9:
			this.rank = Rank.NINE;
		case 10:
			this.rank = Rank.TEN;
		case 11:
			this.rank = Rank.JACK;
		case 12:
			this.rank = Rank.QUEEN;
		case 13:
			this.rank = Rank.KING;
		}
		switch(j) {
		case 1:
			this.suit = Suit.CLUBS;
		case 2:
			this.suit = Suit.DIAMONDS;
		case 3:
			this.suit = Suit.HEARTS;
		case 4:
			this.suit = Suit.SPADES;
		}
	}
	
	int getValue(){
		switch(rank) {
			case ACE: 
				return 11;
			case TWO:
				return 2;
			case THREE:
				return 3;
			case FOUR:
				return 4;
			case FIVE:
				return 5;
			case SIX:
				return 6;
			case SEVEN:
				return 7;
			case EIGHT:
				return 8;
			case NINE:
				return 9;
			case TEN: case JACK: case QUEEN: case KING:
				return 10;
			default:
				return 0;
		}
	}
	
}
