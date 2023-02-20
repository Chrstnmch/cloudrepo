package org.ssglobal.training.codes.item3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestShoppingCart {
	private ShoppingCart sc;
	private ShoppingCart.Product prod;
	private ShoppingCart.Product prod2;
	private ShoppingCart.Product prod3;
	
	@BeforeEach
	public void setup() {
		sc = new ShoppingCart();
		prod = sc.new Product("Beauty of Joseon", 549.95);
		prod2 = sc.new Product("Illiyeon", 649.95);
		prod3 = sc.new Product("Soul Apothera", 895.65);
	}
	
	@AfterEach
	public void teardown() {
		sc = null;
		prod = null;
		prod2 = null;
		prod3 = null;
	}
	
	@Test
	public void testWhenCartZero() {
		int result = sc.getItemCount();
		int expectedResult = 0;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testWhenCartZeroRainy() {
		int result = sc.getItemCount();
		int expectedResult = 0;
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	public void testWhenCartEmpty() {
		sc.empty();
		int result = sc.getItemCount();
		int expectedResult = 0;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testWhenCartEmptyRainy() {
		sc.empty();
		int result = sc.getItemCount();
		int expectedResult = 0;
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	public void testWhenCartAdded() {
		int prevCartCount = sc.getItemCount();
		sc.addItem(prod);
		int currentCartCount = sc.getItemCount();
		assertTrue(prevCartCount < currentCartCount);
	}
	
	
	@Test
	public void testWhenCartAddedAnother() {
		int prevCartCount = sc.getItemCount();
		sc.addItem(prod2);
		int currentCartCount = sc.getItemCount();
		assertTrue(prevCartCount < currentCartCount);
	}
	
	@Test
	public void testWhenCartAddedRainy() {
		int prevCartCount = sc.getItemCount();
		sc.addItem(prod);
		int currentCartCount = sc.getItemCount();
		assertFalse(prevCartCount < currentCartCount);
	}
	
	@Test
	public void testWhenSumCost() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		double result = sc.getBalance();
		assertTrue(result > 0);
	}
	
	@Test
	public void testWhenSumCostRainy() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		double result = sc.getBalance();
		assertFalse(result > 0);
	}
	
	@Test
	public void testWhenCartRemoved() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		
		assertDoesNotThrow(() -> {
			sc.removeItem(prod2);
			int currentCartCount = sc.getItemCount();
			int expectedValue = 2;
			assertEquals(expectedValue, currentCartCount);
		});
	}
	
	@Test
	public void testWhenCartRemovedRainy() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		
		assertDoesNotThrow(() -> {
			sc.removeItem(prod2);
			int currentCartCount = sc.getItemCount();
			int expectedValue = 2;
			assertNotEquals(expectedValue, currentCartCount);
		});
	}
	
	@Test
	public void testWhenCartRemovedNotFound() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		
		assertThrows(ShoppingCart.ProductNotFoundException.class, () -> {
			ShoppingCart.Product prod4 = sc.new Product("Retinol Cream", 655.99);
			sc.removeItem(prod4);
			int currentCartCount = sc.getItemCount();
			int expectedValue = 2;
			assertEquals(expectedValue, currentCartCount);
		});
	}
	
	@Test
	public void testWhenCartRemovedNotFoundRainy() {
		sc.addItem(prod);
		sc.addItem(prod2);
		sc.addItem(prod3);
		
		assertThrows(ShoppingCart.ProductNotFoundException.class, () -> {
			ShoppingCart.Product prod4 = sc.new Product("Retinol Cream", 655.99);
			sc.removeItem(prod4);
			int currentCartCount = sc.getItemCount();
			int expectedValue = 2;
			assertNotEquals(expectedValue, currentCartCount);
		});
	}
	
}
