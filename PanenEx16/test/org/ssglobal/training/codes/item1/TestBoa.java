package org.ssglobal.training.codes.item1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestBoa {
	private Boa jen;
	private Boa ken;
	private Boa dolly;
	private Boa eric;
	private Boa lu;
	
	@BeforeEach
	public void setup() {
		jen = new Boa("Jennifer", 2, "grapes");
		ken = new Boa ("Kenneth", 3, "granola bars");
		dolly = new Boa("Mandy", 4, "rice grains");
		eric = new Boa("Dandy", 5, "mice");
		lu = new Boa("Minie", 6, "parrot");
	}
	
	@AfterEach
	public void teardown() {
		jen = null;
		ken = null;
		dolly = null;
		eric = null;
		lu = null;
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testJenFoodHealthy(String faveFood) {
		boolean result = jen.isHealthy();
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testJenFoodHealthyRainy(String faveFood) {
		boolean result = jen.isHealthy();
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testKenFoodHealthy(String faveFood) {
		boolean result = ken.isHealthy();
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testKenFoodHealthyRainy(String faveFood) {
		boolean result = ken.isHealthy();
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testDollyFoodHealthy(String faveFood) {
		boolean result = dolly.isHealthy();
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testDollyFoodHealthyRainy(String faveFood) {
		boolean result = dolly.isHealthy();
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testEricFoodHealthy(String faveFood) {
		boolean result = eric.isHealthy();
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testEricFoodHealthyRainy(String faveFood) {
		boolean result = eric.isHealthy();
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testLuFoodHealthy(String faveFood) {
		boolean result = lu.isHealthy();
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"granola bars"})
	public void testLuFoodHealthyRainy(String faveFood) {
		boolean result = lu.isHealthy();
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testJenCageLength(int cageLength) {
		boolean result = jen.fitsInCage(cageLength);
		assertTrue(result);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testJenCageLengthRainy(int cageLength) {
		boolean result = jen.fitsInCage(cageLength);
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testKenCageLength(int cageLength) {
		boolean result = ken.fitsInCage(cageLength);
		assertTrue(result);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testKenCageLengthRainy(int cageLength) {
		boolean result = ken.fitsInCage(cageLength);
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testDollyCageLength(int cageLength) {
		boolean result = dolly.fitsInCage(cageLength);
		assertTrue(result);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testDollyCageLengthRainy(int cageLength) {
		boolean result = dolly.fitsInCage(cageLength);
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testEricCageLength(int cageLength) {
		boolean result = eric.fitsInCage(cageLength);
		assertTrue(result);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testEricCageLengthRainy(int cageLength) {
		boolean result = eric.fitsInCage(cageLength);
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testLuCageLength(int cageLength) {
		boolean result = lu.fitsInCage(cageLength);
		assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4, 0, 5, 3, 2, 11, 15,})
	public void testLuCageLengthRainy(int cageLength) {
		boolean result = lu.fitsInCage(cageLength);
		assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testJenLength(int length) {
		assertDoesNotThrow(() -> {
			int result = jen.lengthInInches();
			assertTrue(result <= 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testJenLengthEqualsTen(int length) {
		assertDoesNotThrow(() -> {
			int result = jen.lengthInInches();
			int expectedValue = 10;
			assertEquals(expectedValue, result);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testJenLengthRainy(int length) {
		assertThrows(InvalidBoaLengthException.class, () -> {
			int result = jen.lengthInInches();
			assertFalse(result > 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testKenLength(int length) {
		assertDoesNotThrow(() -> {
			int result = ken.lengthInInches();
			assertTrue(result <= 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testKenLengthEqualsTen(int length) {
		assertDoesNotThrow(() -> {
			int result = ken.lengthInInches();
			int expectedValue = 10;
			assertEquals(expectedValue, result);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testKenLengthRainy(int length) {
		assertThrows(InvalidBoaLengthException.class, () -> {
			int result = ken.lengthInInches();
			assertFalse(result > 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testDollyLength(int length) {
		assertDoesNotThrow(() -> {
			int result = dolly.lengthInInches();
			assertTrue(result <= 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testDollyLengthEqualsTen(int length) {
		assertDoesNotThrow(() -> {
			int result = dolly.lengthInInches();
			int expectedValue = 10;
			assertEquals(expectedValue, result);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testDollyLengthRainy(int length) {
		assertThrows(InvalidBoaLengthException.class, () -> {
			int result = dolly.lengthInInches();
			assertFalse(result > 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testEricLength(int length) {
		assertDoesNotThrow(() -> {
			int result = eric.lengthInInches();
			assertTrue(result <= 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testEricLengthEqualsTen(int length) {
		assertDoesNotThrow(() -> {
			int result = eric.lengthInInches();
			int expectedValue = 10;
			assertEquals(expectedValue, result);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testEricLengthRainy(int length) {
		assertThrows(InvalidBoaLengthException.class, () -> {
			int result = eric.lengthInInches();
			assertFalse(result > 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testLuLength(int length) {
		assertDoesNotThrow(() -> {
			int result = jen.lengthInInches();
			assertTrue(result <= 10);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testLuLengthEqualsTen(int length) {
		assertDoesNotThrow(() -> {
			int result = lu.lengthInInches();
			int expectedValue = 10;
			assertEquals(expectedValue, result);
		});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-4,3, 2, 4, -7, 11, 15, 0, 10})
	public void testLuLengthRainy(int length) {
		assertThrows(InvalidBoaLengthException.class, () -> {
			int result = lu.lengthInInches();
			assertFalse(result > 10);
		});
	}
	
}
