package org.ssglobal.training.codes.item1;

public class Boa {
	private String name;
	private int length; // the length of the boa, in feet
	private String favoriteFood;
	
	public Boa() {
		
	}
	
	public Boa(String name, int length, String favoriteFood) {
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
	}
	
	// returns true if this boa constructor is healthy
	public boolean isHealthy() {
		return this.favoriteFood.equals("granola bars");
	}
	
	// returns true if the length of this boa constructor is
	// less than the given cage length
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
	
	// produces the length of the Boa in inches
	public int lengthInInches() throws InvalidBoaLengthException {
		// you need to write the body of this method
		if (this.length >= 0) {
			return this.length;
		} else {
			throw new InvalidBoaLengthException();
		}
	}
}