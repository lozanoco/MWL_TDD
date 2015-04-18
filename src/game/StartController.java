package game;

import java.util.ArrayList;

public class StartController {

	public int sizeDeck() {		
		return 24;
	}

	public int sizWaste() {
		return 0;
	}

	public ArrayList<Foundation> getFoundations() {
		ArrayList<Foundation> foundations = new ArrayList<Foundation>();
		foundations.add(new Foundation(Suit.CLUBS));
		foundations.add(new Foundation(Suit.SPADES));
		foundations.add(new Foundation(Suit.DIAMONDS));
		foundations.add(new Foundation(Suit.HEARTS));
		return foundations;
	}

	public ArrayList<Tableau> getTableaus() {
		ArrayList<Tableau> tableaus = new ArrayList<Tableau>();
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		tableaus.add(new Tableau());
		return tableaus;
	}

}
