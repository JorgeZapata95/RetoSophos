package com.google.www.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MetroHome {
	public static final Target INPUT_SEARCH = Target.the("Input for searching the products")
			.located(By.id("search-autocomplete-input"));
	public static final Target DISMISS_NOTIFICATIONS = Target.the("Option for dismissing notifications")
			.locatedBy("//*[@id=\"onesignal-popover-cancel-button\"]");

	private MetroHome() {
	}
}
