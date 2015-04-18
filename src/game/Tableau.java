package game;

import java.util.Stack;

public class Tableau {
	
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

}
