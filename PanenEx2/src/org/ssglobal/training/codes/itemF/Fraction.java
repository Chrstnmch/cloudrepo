package org.ssglobal.training.codes.itemF;

class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}

	public Fraction add(Fraction summand) {
		System.out.println("Sum of Two Fractions: ");
		
		int newNumerator = numerator * summand.getDenominator() 
						+ summand.getNumerator() * denominator;
		int newDenominator = denominator * summand.getDenominator();
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Fraction multiply(Fraction factor) {
		System.out.println("Product of Two Fractions: ");
		
		int newNumerator = numerator * factor.getNumerator();
		int newDenominator = denominator * factor.getDenominator();
		return new Fraction(newNumerator, newDenominator);
	}
	
	public boolean greaterEqual(Fraction comp) {	
		System.out.println("Is f2 greather than f1? ");
		return numerator * comp.getDenominator() > denominator * comp.getNumerator()
				? true : false;
	}
}
