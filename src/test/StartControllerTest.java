package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.Foundation;
import game.StartController;
import game.Tableau;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {
	
	private StartController startController;
	
	@Before
    public void before(){
		startController = new StartController();
    }
    
    @Test
    public void getSizeDeckTest() {
    	assertEquals(24, startController.sizeDeck());
    }
    
    
    @Test
    public void getSizeWasteTest() {
    	assertEquals(0, startController.sizWaste());
    }
    
    
    @Test
    public void getFoundationsTest() {
    	Foundation foundation;
    	ArrayList<Foundation> foundations = startController.getFoundations();
    	assertEquals(4, foundations.size());
    	for(int i=0; i< foundations.size();i++){
    		foundation=foundations.get(i);
    		assertEquals(0,foundation.getCardsNumber());
    		}
    }
    
    
    @Test
    public void getTableauTest() {
    	Tableau tableau;
    	ArrayList<Tableau> tableaus = startController.getTableaus();
    	assertEquals(7, tableaus.size());
    	for(int i=0; i< tableaus.size();i++){
    		tableau=tableaus.get(i);
    		assertFalse(tableau.isFirstCardCovered());
    		assertTrue(tableau.isSecondAndRestCardsCovered());
    		}
    	
		}
    
    @Test
    public void getTotalCardsTest() {
    	 int total=0;
    	Tableau tableau;
    	Foundation foundation;
    	 total+=startController.sizeDeck()+startController.sizWaste();
    	 ArrayList<Tableau> tableaus = startController.getTableaus();
    	 for(int i=0; i< tableaus.size();i++){
    		 tableau=tableaus.get(i);
    		 total+=tableau.getSize();
    	 }
    	 ArrayList<Foundation> foundations = startController.getFoundations();
    	 for(int i=0; i< foundations.size();i++){
    		 foundation=foundations.get(i);
     		 total+=foundation.getCardsNumber();
    	 }
    	 assertEquals(52, total);
    }
}
