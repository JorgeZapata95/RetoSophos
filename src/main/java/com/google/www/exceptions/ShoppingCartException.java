package com.google.www.exceptions;

public class ShoppingCartException extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NO_PRODUCT_HAS_BEEN_ADDED = "No product has been found in the shopping cart. The cart was empty";
	public static final String THE_PRODUCT_DOES_NOT_APPEAR_IN_THE_SHOPPING_CART = "The product added is not present in the shopping cart, verify the name of the product in search and shopping cart";

	public ShoppingCartException(String message, Throwable error) {
		super(message, error);
	}
	
	public ShoppingCartException(String message) {
		super(message);
	}
}
