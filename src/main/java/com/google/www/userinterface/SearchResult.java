package com.google.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResult {
	public static final Target PRODUCT_NAME = Target.the("Product name in search result").locatedBy("//*[@class='product-item__name']");
	public static final Target ADD_BUTTON = Target.the("Button to add product to shopping cart").locatedBy("//*[@class=\"product-item__add-to-cart product-add-to-cart btn red add-to-cart\"]");

	private SearchResult() {
	}
}
