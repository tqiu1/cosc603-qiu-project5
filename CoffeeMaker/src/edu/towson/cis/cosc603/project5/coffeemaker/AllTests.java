package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CoffeeMakerTest.class, RecipeTest.class, Inventory.class })
public class AllTests {

}
