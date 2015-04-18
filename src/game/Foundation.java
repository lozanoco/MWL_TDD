package game;

import java.util.Stack;

public class Foundation extends Stack<Card>{

	private static final long serialVersionUID = 9209042459856939280L;

	public Foundation(Suit suit) {
		// TODO Auto-generated constructor stub
	}

	public int getCardsNumber(){
		return 0;		
	}

	public boolean canPush(Card card) {
		if(this.isEmpty()){
			if(card.isFirst())return true;
		}
		else if(card.isSameColor(this.peek()) && card.isNext(this.peek())){
			return true;
		}
		return false;		
	}

}
