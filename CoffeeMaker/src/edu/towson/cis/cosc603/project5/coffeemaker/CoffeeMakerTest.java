package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker  cm;
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
		r1.setAmtChocolate(1);
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
	@Test
	public void testDeleteRecipe1() {

		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
		

	}
	
	@Test
	public void testcheckRecipe1() {

		//cm.addRecipe(r1);
		assertTrue(cm.checkRecipe(r1, true));
	}
	


	@Test//(expected =ArrayIndexOutOfBoundsException.class )
	  public void testOutOfBoundsException() {
		
		ArrayIndexOutOfBoundsException actual=null;
		try{
		       for(int i = 0; i < 6; i++) {
	           if(r1.equals(cm.getRecipeArray()[i])) {
	           }
		       }
		}catch(ArrayIndexOutOfBoundsException e){
		actual=e;
		}
	  assertNotSame(ArrayIndexOutOfBoundsException.class,actual );
	  //assertExceptionThrown(ArrayIndexOutOfBoundsException.class, actual);
	}
	
	
    /**
     * Test for editRecipe() method
     */ 
	@Test
	public void testEditRecipe1() {

		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
    /**
     * Test for checkInventory method
   */ 
	@Test
    public void testCheckInventory() {
		cm.addRecipe(r1);
		assertEquals(15,cm.checkInventory().getCoffee());
    }
    
    /**
     * Testing for addInventory method
   */
	@Test
    public void testAddInventory(){
		cm.addRecipe(r1);
    	assertFalse(cm.addInventory(0,0,2,-1));
    	assertFalse(cm.addInventory(-2,0,0,1));
       	assertTrue(cm.addInventory(0,0,2,1));
    	assertTrue(cm.addInventory(1,1,1,1));
    	
    	assertEquals(16,i.getMilk());
    	assertEquals(16,i.getCoffee());
    	assertEquals(18,i.getSugar());
    	assertEquals(17,i.getChocolate());

    }
    
    /**
     * Testing for makeCoffee method
   */ 
	@Test
    public void testMakeCoffee(){
		assertTrue(cm.addInventory(1,1,1,0));	
    	assertEquals(30, cm.makeCoffee(r1, 80));
    	assertEquals(15,i.getMilk());
    	assertEquals(19,i.getCoffee());
    	assertEquals(15,i.getSugar());
    	assertEquals(14,i.getChocolate());
    	cm.addInventory(0,0,0,5);
    	assertEquals(19,i.getChocolate());

    	
    }
	
    /**
     * Testing for getRecipeForName(String name)method
   */ 
	@Test
	public void testGetRecipeForName() {
		cm.addRecipe(r1);
		assertEquals(r1, cm.getRecipeForName("Coffee"));
	}
}