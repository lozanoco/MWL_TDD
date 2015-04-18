package game;

public class MoveCardController {

	public void move(Waste waste, Foundation foundation) {
		foundation.push(waste.pop());	
	}

}
