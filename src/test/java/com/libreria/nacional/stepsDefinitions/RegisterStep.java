package com.libreria.nacional.stepsDefinitions;

import com.libreria.nacional.exceptions.Validation;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegisterStep {
    @Steps
    HomePageStep homePageStep;
    @Steps
    RegisterPageStep registerPageStep;
    @Steps
    Validation validation;

    @Given("^I am on the Librería Nacional page$")
    public void iAmOnTheLibreríaNacionalPage() {
        homePageStep.openBrowser();
    }
    @And("^I go to the user registration page$")
    public void iGoToTheUserRegistrationPage() {
        homePageStep.clickMicuenta();
        homePageStep.clickRegister();
    }
    @When("^I fill out the registration form$")
    public void iFillOutTheRegistrationForm() throws IOException {
        registerPageStep.enterDataValid();
    }
    @And("^I accept the privacy and data management policies$")
    public void iAcceptThePrivacyAndDataManagementPolicies() {
        registerPageStep.aceptPrivacyPolicy();
    }

    @And("^I click on the button register$")
    public void iClickOnTheButton() {
        registerPageStep.clickButtonRegister();
    }

    @Then("^I see a registration confirmation message$")
    public void iSeeARegistrationConfirmationMessage() throws IOException {
        validation.validateSuccessfulRegistration();
    }



    @When("^I fill out the registration form with invalid data$")
    public void iFillOutTheRegistrationFormWithInvalidData() throws IOException {
        homePageStep.openBrowser();
        homePageStep.clickMicuenta();
        homePageStep.clickRegister();
        registerPageStep.enterDataInvalid();
    }
    @And("^I accept the privacy and data management policies with invalid data$")
    public void iAcceptThePrivacyAndDataManagementPoliciesWithInvalidData() {
        registerPageStep.aceptPrivacyPolicy();
    }

    @And("^I click on the button register with invalid data$")
    public void iClickOnTheButtonWithInvalidData() {
        registerPageStep.clickButtonRegister();
    }

    @Then("^I see an error message indicating that the email address is invalid$")
    public void iSeeAnErrorMessageIndicatingThatTheEmailAddressIsInvalid() {
        validation.validateUnsuccessfulRegistration();
    }

}
