package game.controllers;

import game.models.Card;
import game.models.Deck;
import game.models.Foundation;
import game.models.Tableau;
import game.models.Waste;
import game.utils.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class StartController {
	
	private int MAX_NUM_TABLEAUS=7;
	private Deck deck;
	private Waste waste;
	private List<Tableau> tableaus;
	private List<Foundation> foundations;

	public StartController(){
		deck = new Deck();
		waste = new Waste();
		tableaus = new ArrayList<Tableau>();
		for(int i=0;i<7;i++){
			tableaus.add(new Tableau(i+1));
		}
		generateCards(deck,tableaus);
		foundations = new ArrayList<Foundation>();
		foundations.add(new Foundation(Suit.CLUBS));
		foundations.add(new Foundation(Suit.SPADES));
		foundations.add(new Foundation(Suit.DIAMONDS));
		foundations.add(new Foundation(Suit.HEARTS));

	}

	private void generateCards(Deck deck, List<Tableau> tableaus) {
		Stack<Card> allCards = new Stack<Card>();
		for(Suit suit : Suit.values()){
			for(int i=Card.MIN_VALUE;i<=Card.MAX_VALUE;i++){
				allCards.push(new Card(i,suit));
			}
		}
		Random random = new Random();	
		while(deck.size()!=Deck.MAX_NUM_CARDS){
			int randomOrder = random.nextInt(allCards.size());
			if(allCards.get(randomOrder)!=null){
				deck.push(allCards.get(randomOrder));
				allCards.remove(randomOrder);
			}				
		}
		for(int i=0;i<MAX_NUM_TABLEAUS;i++){
			while(tableaus.get(i).size()!=i+1){
				int randomOrder = random.nextInt(allCards.size());
				if(allCards.get(randomOrder)!=null){
					tableaus.get(i).push(allCards.get(randomOrder));
					allCards.remove(randomOrder);
				}
			}
			tableaus.get(i).peek().setCovered(false);
		}

	}

	public int sizeDeck() {		
		return this.deck.size();
	}

	public int sizWaste() {
		return this.waste.size();
	}

	public List<Foundation> getFoundations() {		
		return this.foundations;
	}

	public List<Tableau> getTableaus() {		
		return this.tableaus;
	}

}
