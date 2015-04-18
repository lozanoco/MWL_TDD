package game;

public class Card {

	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 13;
	private Suit suit;
	private int value;

	public Card(int value, Suit suit) {
		this.value=value;
		this.suit=suit;
	}

	public boolean isFirst() {
		return this.value==1;
	}

	public boolean isSameColor(Card card) {
		if((card.suit.equals(Suit.CLUBS) || card.suit.equals(Suit.SPADES)) 
				&& (this.suit.equals(Suit.CLUBS)||this.suit.equals(Suit.SPADES))) return true;
		if((card.suit.equals(Suit.HEARTS) ||card.suit.equals(Suit.DIAMONDS)) 
				&& (this.suit.equals(Suit.HEARTS)||this.suit.equals(Suit.DIAMONDS))) return true;
		return false;
	}

	public boolean isNext(Card card) {
		return this.value == card.getValue()+1;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isRoi() {
		// TODO Auto-generated method stub
		return this.value == 13;
	}

	public boolean isDifferentColor(Card card) {
		if((card.suit.equals(Suit.CLUBS) || card.suit.equals(Suit.SPADES)) 
				&& (this.suit.equals(Suit.HEARTS)||this.suit.equals(Suit.DIAMONDS))) return true;
		if((card.suit.equals(Suit.HEARTS) ||card.suit.equals(Suit.DIAMONDS)) 
				&& (this.suit.equals(Suit.CLUBS)||this.suit.equals(Suit.CLUBS))) return true;
		return false;
	}

	public boolean isPrevious(Card card) {
		return this.value == card.getValue()-1;
	}

}
