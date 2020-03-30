package com.google.www.interactions;

import static com.google.www.userinterface.SearchResult.*;

import static com.google.www.model.enums.ActorMemory.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddTheFirstProductOnPage implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ADD_BUTTON));
		actor.remember(PRODUCT_NAME_ADDED.getValue(), PRODUCT_NAME.resolveFor(actor).getTextValue());
	}

	public static AddTheFirstProductOnPage toShoppingCart() {
		return Tasks.instrumented(AddTheFirstProductOnPage.class);
	}

}
