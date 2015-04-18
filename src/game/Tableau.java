package game;

import java.util.Stack;


public class Tableau extends Stack<Card>{

	private static final long serialVersionUID = 9080665846640002421L;
	
	private int size;
	
	public Tableau() {
		
	}

	public Tableau(int i) {
		this.size=i;
	}

	public boolean isFirstCardCovered() {
		return false;
	}

	public boolean isSecondAndRestCardsCovered() {
		return true;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean canPush(Card card) {
		if(this.isEmpty()){
			if(card.isRoi())return true;
		}
		else if(card.isDifferentColor(this.peek()) && card.isPrevious(this.peek())){
			return true;
		}
		return false;
	}


}
