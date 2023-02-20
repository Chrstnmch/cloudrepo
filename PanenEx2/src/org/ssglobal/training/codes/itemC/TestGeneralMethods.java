package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		gm.alarm(3);
		System.out.println("\nSum of 1 to 100: \n" + gm.sum100());
		System.out.println("\nSum Range: \n" + gm.sumRange(3, 10));
		System.out.println("\nMaximum value: \n" + gm.maxOfTwo(75, 9234));
		System.out.println("\nIs the first number larger than the second number? \n" 
				+ gm.larger(75.4f, 751.3f));
		System.out.println("\nIs the first number evenly divisible by the second number? \n" 
							+ gm.larger(50, 5));

	}

}
