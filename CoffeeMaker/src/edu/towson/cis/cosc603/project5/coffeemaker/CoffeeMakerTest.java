package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	@Before 
	/**
	 * The setUp method that creates the necessary test objects.
	 */
	
	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}
	
	@Test 
	/**
	 * Runs various equality tests against the CoffeeMaker class
	 */
	
    /**
     * Testing for addRecipe() method
     */ 
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	
	}
	
    /**
     * Test for deleteRecipe() method
     */ 
	public void testDeleteRecipe1() {

		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
		

	}
    /**
     * Test for editRecipe() method
     */ 
	public void testEditRecipe1() {

		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
    /**
     * Test for checkInventory method
   */ 
  
    public void testCheckInventory() {
		Recipe oldRecipe = new Recipe();
		oldRecipe.setName("Coffee");
		oldRecipe.setPrice(50);
		oldRecipe.setAmtCoffee(3);
		oldRecipe.setAmtMilk(1);
		oldRecipe.setAmtSugar(1);
		oldRecipe.setAmtChocolate(0);
		cm.addRecipe(oldRecipe);
		assertEquals(3,cm.checkInventory().getCoffee());
    }
    
    /**
     * Testing for addInventory method
   */ 
    public void testAddInventory(){
    	assertTrue(cm.addInventory(3,4,2,1));
    	
    }
    
    /**
     * Testing for makeCoffee method
   */ 
    public void testMakeCoffee(){
 	    	
    	assertEquals(30, cm.makeCoffee(r1, 80));
    	
    }
    
}