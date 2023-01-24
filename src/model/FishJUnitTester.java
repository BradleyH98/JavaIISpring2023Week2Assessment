/**
 * @author - thowell4
 * CIS175 - Spring 2023
 * Jan 22, 2023
 */
package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishJUnitTester {

	Fish catfish = new Fish("Flat Head Catfish", "Carnivore", "Deep areas in rivers and resevoirs.", true, false);
	Fish shark = new Fish("Bull Shark", "Carnivore", "Temperate and tropical oceans and rivers", true, true);
	
	@Test
	public void waterTypeTesterOne() {
		assertEquals("This fish lives only in fresh water.", catfish.waterType());
	}

	@Test
	public void waterTypreTestTwo() {
		assertNotEquals("This fish lives only in salt water.", shark.waterType());
	}
}
