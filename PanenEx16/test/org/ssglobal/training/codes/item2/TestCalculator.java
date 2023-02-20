package org.ssglobal.training.codes.item2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	private Calculator calc;
	
	// The average running time of evaluate given 10 executions is 0.158s
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}
	
	@AfterEach
	public void teardown() {
		calc = null;
	}
	
	@Test
	public void testComparingSumOfAllTwoDigits() {
		int result = calc.evaluate("25+35+75+65+75");
		int expectedResult = 275;
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testComparingSumOfAllTwoDigitsRainy() {
		int result = calc.evaluate("25+35+75+65+75");
		int expectedResult = 275;
		assertNotEquals(result, expectedResult);
	}

	@Test
	public void testComparingSum() {
		int result = calc.evaluate("752+35/1+8");
		int expectedResult = 275;
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testComparingSumRainy() {
		int result = calc.evaluate("752+35/1+8");
		int expectedResult = 55;
		assertNotEquals(result, expectedResult);
	}

	@Test
	public void testMultiplication() {
		int result = calc.evaluate("9*8*2*7");
		int expectedResult = 652;
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testMultiplicationRainy() {
		int result = calc.evaluate("9*8*2*7");
		int expectedResult = 652;
		assertNotEquals(result, expectedResult);
	}

	@Test
	public void testSubtraction() {
		int result = calc.evaluate("9-18-2-7");
		int expectedResult = 36;
		assertEquals(result, expectedResult);
	}

	@Test
	public void testSubtractionRainy() {
		int result = calc.evaluate("9-18-2-7");
		int expectedResult = 36;
		assertNotEquals(result, expectedResult);
	}
	
	@Test
	public void testNumberGreaterThan300() {
		int result = calc.evaluate("25+89+35");
		assertTrue(result > 300);
	}
	
	@Test
	public void testNumberGreaterThan300Rainy() {
		int result = calc.evaluate("25+89+35");
		assertFalse(result > 300);
	}
	
	@Test
	public void testPositiveNumber() {
		int result = calc.evaluate("45+8-5");
		assertTrue(result > 0);
	}
	
	@Test
	public void testPositiveNumberRainy() {
		int result = calc.evaluate("45+8-5");
		assertFalse(result > 0);
	}
	
	@Test
	public void testLessThan300() {
		int result = calc.evaluate("45+8-5*500+4");
		assertTrue(result < 300);
	}
	
	@Test
	public void testLessThan300Rainy() {
		int result = calc.evaluate("45+8-5*500+4");
		assertFalse(result < 300);
	}
	
	@Test
	public void testSumException() {
		assertDoesNotThrow(() -> {
			int result = calc.evaluate("95+8+7+1+8");
			int expectedValue = 119;
			assertEquals(expectedValue, result);
		});
	}
	
	@Test
	public void testSumExceptionRainy() {
		assertThrows(ArithmeticException.class, () -> {
			int result = calc.evaluate("95+8+7+1+8");
			int expectedValue = 119;
			assertNotEquals(expectedValue, result);
		});
	}
}
