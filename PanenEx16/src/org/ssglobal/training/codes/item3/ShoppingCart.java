package org.ssglobal.training.codes.item3;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	@SuppressWarnings("rawtypes")
	private ArrayList items;
	
	@SuppressWarnings("rawtypes")
	public ShoppingCart() {
		items = new ArrayList();
	}
	
	@SuppressWarnings("rawtypes")
	public double getBalance() {
		double balance = 0.00;
		
		for (Iterator i = items.iterator(); i.hasNext();){
			Product item = (Product)i.next();
			balance += item.getPrice();
		}
		
		return balance;
	}
	
	@SuppressWarnings("unchecked")
	public void addItem(Product item) {
		items.add(item);
	}
	
	public void removeItem(Product item) throws ProductNotFoundException {
		if (!items.remove(item)) {
			throw new ProductNotFoundException();
		}
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public void empty() {
		items.clear();
	}
	
	public class Product {
		private String title;
		private double price;
		
		public Product (String t, double p) {
			this.title = t;
			this.price = p;
		}
		
		public String getTitle() {
		return title;
		}
		
		public double getPrice() {
			return price;
		}
	
		public boolean equals(Object o) {
			if (o instanceof Product) {
				Product p = (Product)o;
				return p.getTitle().equals(title);
			}
			return false;
		}
	}
	
	public class ProductNotFoundException extends Exception {
		private static final long serialVersionUID = 3735530953612086816L;

		public ProductNotFoundException() {
			super();
		}
	}
}
