/**
 * @author - thowell4
 * CIS175 - Spring 2023
 * Jan 21, 2023
 */
package model;

public class Fish extends Animal{

	private Boolean freshWater;
	private Boolean saltWater;
	
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String dietType, String ecosystemType, Boolean freshWater, Boolean saltWater) {
		super(name, dietType, ecosystemType);
		this.freshWater = freshWater;
		this.saltWater = saltWater;
	}

	public Boolean getFreshWater() {
		return freshWater;
	}

	public void setFreshWater(Boolean freshWater) {
		this.freshWater = freshWater;
	}

	public Boolean getSaltWater() {
		return saltWater;
	}

	public void setSaltWater(Boolean saltWater) {
		this.saltWater = saltWater;
	}
	
	public String waterType() {
		if (freshWater == true) {
			return "This fish lives only in fresh water.";
		} else if (saltWater == true) {
			return "This fish lives only in salt water.";
		} else if (freshWater == true && saltWater == true) {
			return "This fish is capable of living in fresh and salt water.";
		} else return "A fish has to live in either fresh water, salt water, or live in both.";
	}

	@Override
	public String toString() {
		return "Fish [freshWater=" + freshWater + ", saltWater=" + saltWater + "]";
	}
	
}
