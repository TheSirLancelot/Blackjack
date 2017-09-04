package Blackjack;

public class Dealer extends Player{

	Dealer(){
		Deck deck = new Deck(1);
		deck.shuffle();
	}
	
	void deal(Player player){
		player.hand.addCard();
	}
	
}
