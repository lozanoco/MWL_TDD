package game.models;

import game.utils.Suit;

public class Card {

	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 13;
	private Suit suit;
	private int value;
	private boolean covered;

	public Card(int value, Suit suit) {
		this.value=value;
		this.suit=suit;
		this.covered=true;
	}

	public boolean isFirst() {
		return this.value==1;
	}

	public boolean isCovered() {
		return this.covered;
	}

	public void setCovered(boolean value) {
		this.covered=value;
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
		return this.value == 13;
	}

	public boolean isPrevious(Card card) {
		return this.value == card.getValue()-1;
	}

}
