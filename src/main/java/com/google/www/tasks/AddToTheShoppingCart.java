package com.google.www.tasks;

import com.google.www.interactions.AddTheFirstProductOnPage;
import com.google.www.interactions.Search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddToTheShoppingCart implements Task {
	private String product;
	
	public AddToTheShoppingCart(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Search.theProduct(product), AddTheFirstProductOnPage.toShoppingCart());
		
	}

	public static AddToTheShoppingCart theProduct(String product) {
		return Tasks.instrumented(AddToTheShoppingCart.class, product);
	}

}
