package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleDemoTest {
	@BeforeAll
	 static void beforeAll() {
	 System.out.println("Connect to the database");
	 }
	 @BeforeEach
	 void beforeEach() {
	 System.out.println("Load the schema");
	 }
	 @Test
	   public void testIncrement() {
	  assertTrue(Counter.increment() == 1);
	   System.out.println("Test One");
	  //assertTrue(Counter.increment() == 2);
	  }
	 @Test
	  public void testDecrement() {
	   assertFalse(Counter.decrement() == -1);
	    System.out.println("Test Two");
	   //assertTrue(Counter.increment() == -2);
	   } 
	 @AfterEach
	 void afterEach() {
	 System.out.println("Drop the schema");
	 }
	 @AfterAll
	 static void afterAll() {
	 System.out.println("Disconnect from the database");
	 }
	 @Test
	 void testOne() {
	 System.out.println("Test One");
	 }
	 @Test
	 void testTwo() {
	 System.out.println("Test Two");
	 }

}
