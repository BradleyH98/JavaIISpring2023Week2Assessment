package model;

public class Mammal extends Animal {
	
	private Boolean packAnimal;
	private Boolean hibernation;
	
	public Mammal() {
		super(); 
	}
	
	public Mammal(String name, String dietType, String ecosystemType, Boolean packAnimal, Boolean hibernation) {
		super(name, dietType, ecosystemType);
		this.packAnimal = packAnimal;
		this.hibernation = hibernation;
	}
	
	public Boolean getPackAnimal() {
		return packAnimal;
	}
	public void setPackAnimal(Boolean packAnimal) {
		this.packAnimal = packAnimal;
	}
	public Boolean getHibernation() {
		return hibernation;
	}
	public void setHibernation(Boolean hibernation) {
		this.hibernation = hibernation;
	}
	
	public String hibernationCheck() {
		if (hibernation == true) {
			return "This mammal hibernates for a set period of time each year. This time is typically winter.";
		} else return "This mammal remains active year round";
	}

	public String packAnimalCheck(Boolean packAnimal) {
		if (packAnimal == true) {
			return "These mammals live in packs with there own kind";
		} else return "This mammel is a solitary creature. These are typically apex predators.";
	}
	
	@Override
	public String toString() {
		return "Mammal [packAnimal=" + packAnimal + ", hibernation=" + hibernation + "]";
	}

}
