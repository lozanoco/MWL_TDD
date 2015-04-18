package game;

import java.util.Stack;

public class Deck extends Stack<Card>{

	private static final long serialVersionUID = 2228551544830936537L;

	public boolean isEmpty() {
		return this.size()==0;
	}

	public boolean canPop(int number) {
		if(number<=3)return true;		
		return false;
	}

}
