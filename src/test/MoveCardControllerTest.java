package test;

import static org.junit.Assert.*;
import game.Card;
import game.Deck;
import game.Foundation;
import game.MoveCardController;
import game.Suit;
import game.Waste;

import org.junit.Before;
import org.junit.Test;

public class MoveCardControllerTest {

	private MoveCardController moveController;

	@Before
	public void before(){
		moveController = new MoveCardController();

	}

	@Test
	public void moveFromWasteToFoundationTest(){

		//No cards in foundation & A in waste 
		Card card = new Card(1,Suit.CLUBS);
		Waste waste = new Waste();
		waste.push(card);		
		Foundation foundation = new Foundation(Suit.CLUBS);	
		assertFalse(waste.isEmpty());
		assertTrue(foundation.canPush(card));
		moveController.move(waste,foundation);
		int numberCardsWaste = waste.size();
		int numberCardsFoundation = foundation.size();
		assertEquals(numberCardsWaste+1,foundation.size());
		assertEquals(numberCardsFoundation-1,waste.size());
		assertEquals(card,foundation.peek());	

		//No cards in foundation & no A in waste 
		card = new Card(2,Suit.CLUBS);
		waste = new Waste();
		waste.push(card);		
		foundation = new Foundation(Suit.CLUBS);	
		assertFalse(waste.isEmpty());
		assertFalse(foundation.canPush(card));
		moveController.move(waste,foundation);
		numberCardsWaste = waste.size();
		numberCardsFoundation = foundation.size();
		assertEquals(numberCardsWaste,waste.size());
		assertEquals(numberCardsFoundation,foundation.size());

		//Waste card  no consecutive to Foundation card
		card = new Card(1,Suit.CLUBS);
		waste = new Waste();
		waste.push(card);		
		foundation = new Foundation(Suit.CLUBS);	
		moveController.move(waste,foundation);

		card = new Card(5,Suit.CLUBS);
		waste.push(card);		
		assertFalse(waste.isEmpty());
		assertFalse(foundation.canPush(card));
		moveController.move(waste,foundation);
		numberCardsWaste = waste.size();
		numberCardsFoundation = foundation.size();
		assertEquals(numberCardsWaste,waste.size());
		assertEquals(numberCardsFoundation,foundation.size());

		//Waste card consecutive to Foundation card but different suit
		card = new Card(1,Suit.CLUBS);
		waste = new Waste();
		waste.push(card);		
		foundation = new Foundation(Suit.CLUBS);		
		moveController.move(waste,foundation);

		card = new Card(2,Suit.DIAMONDS);
		waste.push(card);		
		assertFalse(waste.isEmpty());
		assertFalse(foundation.canPush(card));
		moveController.move(waste,foundation);
		numberCardsWaste = waste.size();
		numberCardsFoundation = foundation.size();
		assertEquals(numberCardsWaste,waste.size());
		assertEquals(numberCardsFoundation,foundation.size());

	}

	@Test
	public void moveFromDeckToWasteTest(){
		
		//One card in Deck
		Card card = new Card(1,Suit.CLUBS);
		Deck deck = new Deck();
		deck.push(card);		
		Waste waste = new Waste();			
		int numberDeckCards = deck.size();
		int numberWasteCards = waste.size();			
		assertFalse(deck.isEmpty());	
		assertTrue(deck.canPop(1));	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card,waste.peek());


		//Two cards in Deck
		deck = new Deck();
		card = new Card(1,Suit.CLUBS);
		deck.push(card);	
		Card card2 = new Card(1,Suit.CLUBS);
		deck.push(card2);
		waste = new Waste();			
		numberDeckCards = deck.size();
		numberWasteCards = waste.size();			
		assertFalse(deck.isEmpty());	
		assertTrue(deck.canPop(1));	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card2,waste.peek());

		numberDeckCards = deck.size();
		numberWasteCards = waste.size();
		assertFalse(deck.isEmpty());	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card,waste.peek());


		//Three cards in Deck
		deck = new Deck();
		card = new Card(1,Suit.CLUBS);
		deck.push(card);	
		card2 = new Card(1,Suit.CLUBS);
		deck.push(card2);
		Card card3 = new Card(1,Suit.CLUBS);
		deck.push(card3);
		waste = new Waste();			
		numberDeckCards = deck.size();
		numberWasteCards = waste.size();			
		assertFalse(deck.isEmpty());	
		assertTrue(deck.canPop(1));	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card3,waste.peek());

		numberDeckCards = deck.size();
		numberWasteCards = waste.size();
		assertFalse(deck.isEmpty());	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card2,waste.peek());
		
		numberDeckCards = deck.size();
		numberWasteCards = waste.size();
		assertFalse(deck.isEmpty());	
		moveController.move(deck,waste);		
		assertEquals(numberDeckCards-1,deck.size());
		assertEquals(numberWasteCards+1,waste.size());
		assertEquals(card,waste.peek());


	}

	@Test
	public void moveFromWasteToTableauTest(){




	}

}
