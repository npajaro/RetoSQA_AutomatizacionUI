package com.libreria.nacional.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy.feature",
        glue = "com.libreria.nacional.stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuyRunner {
}
