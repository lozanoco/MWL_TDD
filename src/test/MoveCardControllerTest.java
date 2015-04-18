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
	}
	
	@Test
	public void moveFromDeckToWasteTest(){
		
		

	}
	
	@Test
	public void moveFromWasteToTableauTest(){
		
	

		
	}

}
