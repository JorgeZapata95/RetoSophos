package com.google.www.interactions;

import static com.google.www.userinterface.MetroHome.INPUT_SEARCH;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Search implements Interaction {
	private String product;
	
	public Search(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Dismiss.notifications(), SendKeys.of(product).into(INPUT_SEARCH).thenHit(Keys.ENTER));
		
	}

	public static Search theProduct(String product) {
		return Tasks.instrumented(Search.class, product);
	}

}
