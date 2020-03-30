package com.google.www.questions;

import java.util.List;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;

import com.google.www.exceptions.HttpServiceException;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;

public class TheUsers implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		actor.should(GivenWhenThen.seeThat(LastStatus.code(), Matchers.is(HttpStatus.SC_OK)).orComplainWith(HttpServiceException.class, HttpServiceException.BAD_RESPONSE_SERVICE));
		return SerenityRest.lastResponse().getBody().jsonPath().getList("result.first_name");
	
	}

	public static TheUsers consulted() {
		return new TheUsers();
	}

}
