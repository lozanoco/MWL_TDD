package game;

public class MoveCardController {

	public void move(Waste waste, Foundation foundation) {
		if(foundation.canPush(waste.peek()))foundation.push(waste.pop());	
	}

	public void move(Deck deck, Waste waste) {
		waste.push(deck.pop());
	}

	public void move(Waste waste, Tableau tableau) {
		if(tableau.canPush(waste.peek()))tableau.push(waste.pop());		
	}

}
