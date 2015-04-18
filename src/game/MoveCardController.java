package game;

public class MoveCardController {

	public void move(Waste waste, Foundation foundation) {
		foundation.push(waste.pop());	
	}

	public void move(Deck deck, Waste waste) {
		waste.push(deck.pop());
	}

}
