package com.libreria.nacional.stepsDefinitions;

import com.libreria.nacional.exceptions.Validation;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStep {

    @Steps
    HomePageStep homePageStep;
    @Steps
    LoginPageStep loginPageStep;
    @Steps
    Validation validation;

    @Given("^that I'm on the home page$")
    public void thatIMOnTheHomePage() {
        homePageStep.openBrowser();
    }
    @And("^I go to the login page$")
    public void iGoToTheLoginPage() {
        homePageStep.clickMicuenta();
        homePageStep.clickIniciarSesion();
    }
    @When("^I enter my email and password$")
    public void iEnterMyEmailAndPassword() throws IOException {
        loginPageStep.btnIngresarConMail();
        loginPageStep.enterEmailAndPassword();
    }

    @And("^I click on the “Iniciar Sesion” button$")
    public void iClickOnTheLoginButton() {
        loginPageStep.clickButtonLogin();
    }

    @Then("^I see a welcome message with my name$")
    public void iSeeAWelcomeMessageWithMyName() throws IOException {
        validation.validateLoginSuccessful();
    }



    @When("^I enter an incorrect email or password$")
    public void iEnterAnIncorrectEmailOrPassword() throws IOException {
        homePageStep.openBrowser();
        homePageStep.clickMicuenta();
        homePageStep.clickIniciarSesion();
        loginPageStep.btnIngresarConMail();
        loginPageStep.enterEmailAndPasswordInvalid();
    }

    @Then("^I see an error message indicating that the credentials are invalid$")
    public void iSeeAnErrorMessageIndicatingThatTheCredentialsAreInvalid() {
        validation.validateLoginUnsuccessful();
    }
}
