package test;

import static org.junit.Assert.*;


import game.Card;
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



	}

	@Test
	public void moveFromWasteToTableauTest(){




	}

}
