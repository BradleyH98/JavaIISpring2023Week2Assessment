/**
 * @author - thowell4
 * CIS175 - Spring 2023
 * Jan 21, 2023
 */
package model;

public class Animal {
	
	private String name;
	private String dietType;
	private String ecosystemType;
	
	public Animal() {
		super();
	}
	
	public Animal(String name, String dietType, String ecosystemType) {
		super();
		this.name = name;
		this.dietType = dietType;
		this.ecosystemType = ecosystemType;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDietType() {
		return dietType;
	}
	public void setDietType(String dietType) {
		this.dietType = dietType;
	}
	public String getEcosystemType() {
		return ecosystemType;
	}
	public void setEcosystemType(String ecosystemType) {
		this.ecosystemType = ecosystemType;
	}
	
	public String eatingHabit() {
		if (dietType.equalsIgnoreCase("Carnivore")) {
			return "This animal is a carnivore and likely a predator.";
		} else if (dietType.equalsIgnoreCase("Herbivore")) {
			return "This anmial is a herbivore that eats plants and unlikely is a predator of any kind.";
		} else if (dietType.equalsIgnoreCase("Omnivore")) {
			return "This animal is an omnivore and a scavenger, possibly also a predator.";
		} else {
			return "Check that the animal in question diet type is either a carnivore, herbivore, or omnivore.";
		}
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", dietType=" + dietType + ", ecosystemType=" + ecosystemType + "]";
	}

}
