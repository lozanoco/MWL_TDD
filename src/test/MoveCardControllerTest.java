package test;

import org.junit.Test;

public class MoveCardControllerTest {
	@Test
	public void moveFromWasteToFoundationTest(){

		//No cards in waste
		
		
		//No cards in foundation & A in waste (exist Foundation suit)
		
		
		//No cards in foundation & A in waste (no exist Foundation suit)
		
		
		//No cards in foundation & no A in waste
		
		
		//Waste card consecutive to Foundation card
		
		
		//Waste card  no consecutive to Foundation card
		
		
		//Waste card consecutive to Foundation card but different suit
		
		
	}
	
	@Test
	public void moveFromDeckToWasteTest(){
		
		//All cards in Deck, no cards in Waste

		
		//All cards in Waste, no cards in Deck
	
		
		//One card in Deck, rest in Waste

		
		//Two cards in Deck, rest in Waste
	
		
		//Three cards in Deck, rest in Waste
	
		
		//More than Three cards in Deck, rest in Waste		

	}
	
	@Test
	public void moveFromWasteToTableauTest(){
		
		//No cards in Waste


		//No cards in Tableau, score card different to ROI in Waste

		
		//No cards in Tableau,  card ROI in Waste

		
		//One score lower card in Waste that tableau (same color)	


		//One score lower card in Waste that tableau (different color)

		
	}

}
