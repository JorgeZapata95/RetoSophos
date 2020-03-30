package com.google.www.stepdefinitions.metro;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.google.www.exceptions.ShoppingCartException;
import com.google.www.model.enums.ActorMemory;
import com.google.www.questions.TheShoppingCart;
import com.google.www.tasks.AddToTheShoppingCart;
import com.google.www.userinterface.MetroHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class ProductsPurchase {
	
	private static final String ACTOR_NAME = "Juan";
	
	@Managed
	private WebDriver hisBrowser;
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled(ACTOR_NAME).whoCan(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^Juan wants to add a new product to his shopping cart$")
	public void juanWantsToAddANewProductToHisShoppingCart() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(MetroHomePage.class));
	}

	@When("^Juan tries to add the product (.*) to his shopping cart$")
	public void juanTriesToAddTheProductLavadoraToHisShoppingCart(String product) {
	    theActorInTheSpotlight().attemptsTo(AddToTheShoppingCart.theProduct(product));
	}

	@Then("^Juan should see that his purchase is now including the added product$")
	public void juanShouldSeeThatHisPurchaseIsNowIncludingTheAddedProduct() {
	    theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheShoppingCart.list(), Matchers.hasItem((String)theActorInTheSpotlight().recall(ActorMemory.PRODUCT_NAME_ADDED.getValue()))).orComplainWith(ShoppingCartException.class, ShoppingCartException.THE_PRODUCT_DOES_NOT_APPEAR_IN_THE_SHOPPING_CART));	    
	}

}
