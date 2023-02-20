package org.ssglobal.training.codes.itemB;

public class ArithmeticX {
	public static void compute() {
	// declare variables
		float number1, number2, number3;
		// input data
		number1 = 1.1f;
		number2 = 2.2f;
		number3 = 3.3f;
		// calculate average
		float average = number1 + number2 + number3 / 3;
		// print results
		System.out.print(number1 + ", " + number2 + " & "
						+ number3);
		System.out.println(" averages to " + average);
	}
	
	/*
	 * Errors:
	 * 1. Spaces on variables on line 8, 9, 10
	 * 2. The num1, num2, num3 was not initialized on line 12
	 * 3. The plus sign should have been on the line 15
	 * 4. The average was not initialized so I put float data type on line 12
	 * 5. There is a space after the number3 for line 15 
	 * 6. The variables on line 14 and 15 was not also initialized so I corrected it 
	 */
}