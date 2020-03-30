package com.google.www.tasks;

import com.google.www.model.enums.ActorMemory;
import com.google.www.model.enums.ServiceAssets;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultTheUser implements Task {
	private String name;
	
	public ConsultTheUser(String name) {
		this.name = name;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(ServiceAssets.GET_USERS.getValue())
				.with(restConfiguration -> restConfiguration.auth()
						.oauth2(ServiceAssets.AUTHORIZATION.getValue())
						.accept(ContentType.JSON)
						.param("first_name", name)
						.log().all().relaxedHTTPSValidation()
						)
				);
		actor.remember(ActorMemory.SOUGHT_USER.getValue(), name);
		SerenityRest.lastResponse().prettyPrint();
		
	}

	public static Performable withName(String name) {
		return Tasks.instrumented(ConsultTheUser.class, name);
	}

}
