package com.google.www.stepdefinitions.api;

import static com.google.www.model.enums.ActorMemory.SOUGHT_USER;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.Matchers;

import com.google.www.model.enums.ServiceAssets;
import com.google.www.questions.TheUsers;
import com.google.www.tasks.ConsultTheUser;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ConsultUsers {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^(.*) wants to make a consult of users$")
	public void juanWantsToMakeAConsultOfUsers(String actorName) {
		theActorCalled(actorName).whoCan(CallAnApi.at(ServiceAssets.BASE_ENDPOINT.getValue()));
	}

	@When("^Juan tries to consult the user with name (.*)$")
	public void juanTriesToConsultTheUserWithName(String name) {
	    theActorInTheSpotlight().attemptsTo(ConsultTheUser.withName(name));
	}

	@Then("^Juan should see that the consulted user appears$")
	public void juanShouldSeeThatTheConsultedUserAppears() {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheUsers.consulted(), Matchers.hasItem((String)theActorInTheSpotlight().recall(SOUGHT_USER.getValue()))));
	}

}
