package com.google.www.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/com/google/www/features/consult_users.feature", 
		glue = "com.google.www.stepdefinitions.api", 
		snippets = CAMELCASE
		)
public class ConsultUsers {

}
