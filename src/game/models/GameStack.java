package game.models;

import java.util.Stack;

public abstract class GameStack extends Stack<Card>{

	private static final long serialVersionUID = 1L;

	public abstract boolean canPush(Card card);

}
