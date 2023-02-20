package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	
	 /*
	 * Method 1: powersOfTwo
	 */
	public void powersOfTwo() {
		byte base = 2;
		int result = 1;
		
		System.out.println("First 10 powers of 2: ");
		
		for (int count = 1; count <= 10; count++) {
			result *= base;
			System.out.print(result + " ");
		}
	} 
	
	 /*
	 * Method 2: alarm
	 */
	public void alarm(int number) {
		System.out.println("\n\nAlarm Method: ");
		
		for(int i = 0; i < number; i++) {
			System.out.println("Alarm!");
		}
	}
	
	 /*
	 * Method 3: sum100
	 */
	
	public short sum100() {
		short sum = 0;
		
		for (int k = 1; k <= 100; k++) {
			sum += k;
		}
		
		return sum;
	}
	
	/*
	 * Method 4: sumRange
	 */
	public short sumRange(int num1, int num2) {
		short sum = 0;
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	/*
	 * Method 5: maxOfTwo
	 */
	public int maxOfTwo(int x, int y) {
		return x > y ? x : y;
	}
	
	/*
	 * Method 6: larger
	 */
	public boolean larger(float x, float y) {
		return x > y ? true : false;
	}
	
	/*
	 * Method 6: evenlyDivisible
	 */
	public boolean evenlyDivisible(int x, int y) {
		return x % y == 0 || y % x == 0 ? true : false;
	}
}
