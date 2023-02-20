package org.ssglobal.training.codes.itemD;

public class Overflow {
	
	public static boolean sumOverflow(byte x, byte y) {
		return x + y >= -128 || x + y <= 127 ? true : false;
	}
}
