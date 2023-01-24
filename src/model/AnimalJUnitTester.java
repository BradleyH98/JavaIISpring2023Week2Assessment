/**
 * @author - thowell4
 * CIS175 - Spring 2023
 * Jan 22, 2023
 */
package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalJUnitTester {
	Animal snake = new Animal("Rattle Snake", "Carnivore", "Woodlands and flat plains");
	
	@Test
	public void dietCarTest() {
		String carn = "This animal is a carnivore and likely a predator.";
		assertEquals(carn, snake.eatingHabit());
	}

}
