package com.google.www.interactions;

import static com.google.www.userinterface.MetroHome.DISMISS_NOTIFICATIONS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Dismiss implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		BrowseTheWeb.as(actor).$(DISMISS_NOTIFICATIONS.getCssOrXPathSelector()).click();
	}

	public static Dismiss notifications() {
		return Tasks.instrumented(Dismiss.class);
	}

}
