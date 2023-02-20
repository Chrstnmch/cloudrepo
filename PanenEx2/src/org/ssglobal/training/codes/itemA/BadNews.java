package org.ssglobal.training.codes.itemA;

public class BadNews {
	public static int maxNumber = 21;
	
	public static void writeOdds() {
		// print each odd number
		for (int count = 1; count <= maxNumber; count+=2) {
			System.out.print(count + " ");
		}
		
	}
	
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		
		maxNumber = 11; // now, overwrite the value of max number to 11
		
		System.out.println(); 
		writeOdds();
	}
	
	/*
	 * Errors:
	 * 1. final should not be part of MAX_ODD as it is not need to be constant, 
	 * I change the variable to maxNumber
	 * 2. maxNumber should not deduct 2 on the original number
	 * 3. The count++ in the loop should be count += 2
	 * 4. count = count + 2 is not needed as it is already been indicated on the loop, 
	 * otherwise it will be adding 4
	 * 5. System.out.print(count + 2) is not needed as it is not part of the output that was shown. 
	 * The 2 should have been " " for space
	 * */
}