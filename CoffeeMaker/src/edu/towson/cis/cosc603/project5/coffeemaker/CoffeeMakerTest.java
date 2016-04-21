package edu.towson.cis.cosc603.project5.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	public void testAddRecipe11() {
		
		Recipe newRecipe = new Recipe();
		newRecipe.setName("Coffee");
		newRecipe.setPrice(50);
		newRecipe.setAmtCoffee(3);
		newRecipe.setAmtMilk(1);
		newRecipe.setAmtSugar(1);
		newRecipe.setAmtChocolate(0);
			
		assertTrue(cm.addRecipe(newRecipe));
	}
	
	public void deleteRecipe11() {
		
		Recipe newRecipe = new Recipe();
		newRecipe.setName("Coffee");
		newRecipe.setPrice(50);
		newRecipe.setAmtCoffee(3);
		newRecipe.setAmtMilk(1);
		newRecipe.setAmtSugar(1);
		newRecipe.setAmtChocolate(0);
		cm.addRecipe(newRecipe);
		assertTrue(cm.deleteRecipe(newRecipe));
	}
	
	public void editRecipe11() {
		
		Recipe oldRecipe = new Recipe();
		oldRecipe.setName("Coffee");
		oldRecipe.setPrice(50);
		oldRecipe.setAmtCoffee(3);
		oldRecipe.setAmtMilk(1);
		oldRecipe.setAmtSugar(1);
		oldRecipe.setAmtChocolate(0);
		cm.addRecipe(oldRecipe);
		Recipe newRecipe = new Recipe();
		newRecipe = oldRecipe;
		assertTrue(cm.editRecipe(oldRecipe, newRecipe));
	}
	
}