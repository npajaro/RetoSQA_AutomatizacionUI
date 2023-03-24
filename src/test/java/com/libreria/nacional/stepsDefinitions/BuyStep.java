package com.libreria.nacional.stepsDefinitions;

import com.libreria.nacional.exceptions.Validation;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class BuyStep {
    @Steps
    HomePageStep homePageStep;
    @Steps
    RegisterPageStep registerPageStep;
    @Steps
    Validation validation;

    @Steps
    BuyPageStep buyPageStep;

    @Given("^I navigate to the user registration page$")
    public void iNavigateToTheUserRegistrationPage() {
        homePageStep.openBrowser();
        homePageStep.clickMicuenta();
        homePageStep.clickRegister();
    }
    @When("^I search for the book Android Manual Práctico para todos los Niveles$")
    public void iSearchForTheBookAndroidManualPrácticoParaTodosLosNiveles() {
        registerPageStep.searchBook();
    }

    @And("^I should see results related to the book title$")
    public void iShouldSeeResultsRelatedToTheBookTitle(){
        validation.validateBookSearch();
    }

    @And("^I choose Agregar al carrito$")
    public void iChooseAgregarAlCarrito() {
        buyPageStep.addToCart();
    }

    @And("^I close the modal$")
    public void iCloseTheModal() {
        buyPageStep.closeModalItems();
    }
    @And("^I choose Ver Carrito$")
    public void iChooseVerCarrito() {
        buyPageStep.clickShoppingCartButton();
    }
    @And("^I add 2 books to the cart$")
    public void iAddBooksToTheCart() {
        buyPageStep.clickAddItem();
    }

    @And("^I choose Continuar con la compra$")
    public void iChooseContinuarConLaCompra() {
        buyPageStep.clickButtonContinueShopping();
    }

    @When("^I add information in the mandatory fields form$")
    public void iAddInformationInTheMandatoryFieldsForm() throws IOException {
        buyPageStep.clickAddNewAddress();
        buyPageStep.enterMandatoryData();
        buyPageStep.clickSaveButton();
        buyPageStep.clickCloseModal();
    }

    @Then("^I validate that there are 2 books in the cart$")
    public void iValidateThatThereAreBooksInTheCart() {
        validation.validateBookQuantity();
    }

    @Then("^I valid the total price$")
    public void iValidTheTotalPrice() {
        validation.validateTotalPrice();
    }

}
