package com.google.www.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.www.exceptions.ShoppingCartException;
import static com.google.www.userinterface.ShoppingCart.*;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class TheShoppingCart implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		List<String> productList = new ArrayList<>();
		actor.attemptsTo(Click.on(SHOPPING_CART_BUTTON));
		actor.should(seeThat(the(SEE_SHOPPING_CART_BUTTON), isVisible()).orComplainWith(ShoppingCartException.class, ShoppingCartException.NO_PRODUCT_HAS_BEEN_ADDED));
		actor.attemptsTo(Click.on(SEE_SHOPPING_CART_BUTTON));
		Iterator<WebElementFacade> iterator = PRODUCT_NAME.resolveAllFor(actor).iterator();
		while(iterator.hasNext()) productList.add(iterator.next().getTextValue());
		return productList;
	}

	public static TheShoppingCart list() {
		return new TheShoppingCart();
	}

}
