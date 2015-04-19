package game.models;

import game.utils.Suit;

public class Foundation extends GameStack{
	
	private Suit suit;

	private static final long serialVersionUID = 9209042459856939280L;

	public Foundation(Suit suit) {
		this.suit=suit;
	}

	public int getCardsNumber(){
		return 0;		
	}
	
	@Override
	public boolean canPush(Card card) {
		if(this.suit!=card.getSuit())return false;
		if(this.isEmpty()){
			if(card.isFirst())return true;
		}
		else if(card.isSameColor(this.peek()) && card.isNext(this.peek())){
			return true;
		}
		return false;		
	}

}
