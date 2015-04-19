package game.utils;

public enum Suit {
	HEARTS(Color.RED), DIAMONDS(Color.RED), CLUBS(Color.BLACK), SPADES(Color.BLACK);	

	Color color;

	private Suit(Color color) { 
		this.color=color;
	}
	public boolean isSameColor(Suit suit) {
		return this.color == suit.color;
	}
}
