/**
 * @author - thowell4
 * CIS175 - Spring 2023
 * Jan 22, 2023
 */
package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MammalJUnitTester {
	
	Mammal bear = new Mammal("Grizzly Bear", "Omnivore", "Woods, in northern colder climates typically.", false, true);
	Mammal bigCat = new Mammal("Lion", "Carnivore", "Central plains and bush lands in Africa.", true, false);
	
	@Test
	public void incorrectionInHibernationaCheck() {
		assertNotNull(bigCat.getName(), bigCat.getDietType());
	}

}
