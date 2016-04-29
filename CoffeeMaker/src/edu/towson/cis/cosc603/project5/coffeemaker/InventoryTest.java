package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 4/23/16 12:30 PM
 * @author Tom
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	private CoffeeMaker  cm;
	private Inventory i;
	private Recipe r1;
	
	@Before 
	/**
	 * The setUp method that creates the necessary test objects.
	 */
	
	public void setUp1() {
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
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setPrice(56);
		r.setAmtCoffee(4);
		r.setAmtMilk(3);
		r.setAmtSugar(2);
		r.setAmtChocolate(1);
		boolean result = fixture.enoughIngredients(r);
		
		
		cm.addInventory(3,2,4,1);
		i = cm.checkInventory();
        if ((i.getChocolate() < r.getAmtChocolate())|| (i.getSugar() < r.getAmtSugar())||(i.getCoffee() < r.getAmtCoffee())||(i.getMilk() < r.getAmtMilk())) {
        	assertEquals(false, result);
        	}      
        if ((i.getChocolate() < r.getAmtChocolate())|| (i.getSugar() > r.getAmtSugar())||(i.getCoffee() > r.getAmtCoffee())||(i.getMilk() >r.getAmtMilk())) {
        	assertEquals(true, result);
        	} 
        if ((i.getChocolate() < r.getAmtChocolate())|| (i.getSugar() < r.getAmtSugar())||(i.getCoffee() > r.getAmtCoffee())||(i.getMilk() > r.getAmtMilk())) {
        	assertEquals(true, result);
        	}  
        if ((i.getChocolate() > r.getAmtChocolate())|| (i.getSugar() > r.getAmtSugar())||(i.getCoffee() > r.getAmtCoffee())||(i.getMilk() > r.getAmtMilk())) {
        	assertEquals(true, result);
        	}   
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();

		boolean result = fixture.enoughIngredients(r1);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = -1;

		fixture.setCoffee(coffee);
		assertEquals(0, fixture.getCoffee());
		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int coffee = 1;

		fixture.setCoffee(coffee);
		
		assertEquals(1, fixture.getCoffee());
		// add additional test code here
	}

	
	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetCoffee_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int coffee = 0;

		fixture.setCoffee(coffee);

		// add additional test code here
	}
	
	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();
		int sugar = 1;

		fixture.setSugar(sugar);
		
		fixture.setSugar(-3);
		assertEquals(0,fixture.getSugar());
		

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/23/16 12:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}