package test;

import static org.junit.Assert.*;
import game.StartController;

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
    }
    
    
    @Test
    public void getFoundationsTest() {

    }
    
    
    @Test
    public void getTableauTest() {
    	
		}
	
}
