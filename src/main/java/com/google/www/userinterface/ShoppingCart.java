package com.google.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {
	public static final Target PRODUCT_NAME = Target.the("Product name on shopping cart").locatedBy("//*[@class='product-item__name']");
	public static final Target SHOPPING_CART_BUTTON = Target.the("Button for going to the shopping cart").locatedBy("//*[@class=\"btn red minicart__action--toggle-open food-site\"]");
	public static final Target EMPTY_CART_MESSAGE = Target.the("Message indicating the shopping cart is empty").locatedBy("//*[contains(text(), 'Tu carrito está vacío')]");
	public static final Target SEE_SHOPPING_CART_BUTTON = Target.the("Button for going to the shopping cart view").locatedBy("//*[@id=\"minicart-navigation\"]//*[@class=\"minicart__totalizers\"]//following-sibling::a/span[contains(text(), 'Ver carrito')]");
	
	private ShoppingCart() {
	}
}
