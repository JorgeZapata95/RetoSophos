package com.google.www.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LastStatus implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		return SerenityRest.lastResponse().getStatusCode();
	}

	public static Question<Integer> code() {
		return new LastStatus();
	}

}
