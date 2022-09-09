package com.chromium.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registrar.feature", 
	glue = "com.chromium.stepsdefinitions", 
	snippets = SnippetType.CAMELCASE, 
	tags = {"@registro"})
public class RegistrarRunner {

}
