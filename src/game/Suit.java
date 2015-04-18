package game;

public enum Suit {
	HEARTS(0), DIAMONDS(1), CLUBS(2), SPADES(3);
	
	private int length;
	
	private Suit(final int leng) { 
		this.length = leng; 
		}
}
