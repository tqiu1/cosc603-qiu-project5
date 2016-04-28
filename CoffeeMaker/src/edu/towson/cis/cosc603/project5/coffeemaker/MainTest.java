package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class MainTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	private Main m;

	@Before 
	/**
	 * The setUp method that creates the necessary test objects.
	 */
	
	public void setUp() {
		cm = new CoffeeMaker();
		m=new Main();
		//cm = m.coffeeMaker;
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
	 * Runs various equality tests against the Main class
	 */
	
    /**
     * Test against for mainMenu() method
     */ 
	
	public void testMainMenu(){
		//m.mainMenu();
        System.out.println("1. Add a recipe");
        System.out.println("2. Delete a recipe");
        System.out.println("3. Edit a recipe");
        System.out.println("4. Add inventory");
        System.out.println("5. Check inventory");
        System.out.println("6. Make coffee");
        System.out.println("0. Exit");
 /*       
        //Get user input
        final int userInput = m.stringToInt(m.inputOutput("Please press the number that corresponds to what you would like the coffee maker to do."));
        
        if(userInput == 1) testAddRecipe();
        if(userInput == 2) testDeleteRecipe();
        if(userInput == 3) testEditRecipe();
        if(userInput == 4) testAddInventory();
        if(userInput == 5) testCheckInventory();
        if(userInput == 6) testMakeCoffee();
        if(userInput == 0) System.exit(0);
  */      
	}
    /**
     * Test against for AddRecipe() method
     */ 
	@Test 
	public void testAddRecipe(){
		m.addRecipe();
		assertEquals(r1, m.coffeeMaker.getRecipeForName("Coffee"));
	}
	/**
     * Test against for DeleteRecipe() method
     */ 
	@Test 
	public void testDeleteRecipe(){
		m.deleteRecipe();
	}
	/**
     * Test against for EditRecipe() method
     */
	@Test 
	public void testEditRecipe(){
		m.editRecipe();
	}
	
	/**
     * Test against for addInventory() method
     */ 
	@Test 
	public void testAddInventory(){
		m.addInventory();
	}
	
	/**
     * Test against for checkInventory() method
     */ 
	@Test 
	public void testCheckInventory(){
		m.checkInventory();
	}
	
	/**
     * Test against for makeCoffee() method
     */	
	@Test 
	public void testMakeCoffee(){
		m.makeCoffee();
	}
	
	@Test 
	public void testStringToInt(){
		assertEquals(2,m.stringToInt("2"));
	}
	}