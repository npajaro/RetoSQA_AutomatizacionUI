package com.libreria.nacional.exceptions;

import com.libreria.nacional.pagesObjects.BuyPageObject;
import com.libreria.nacional.pagesObjects.HomePageObject;
import com.libreria.nacional.pagesObjects.LoginPageObject;
import com.libreria.nacional.pagesObjects.RegisterPageObject;
import com.libreria.nacional.utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Validation {
    private static ArrayList<Map<String, String>> leerExcelInfoBasica = new ArrayList<>();
    HomePageObject homePageObject = new HomePageObject();
    RegisterPageObject registerPageObject = new RegisterPageObject();
    LoginPageObject loginPageObject = new LoginPageObject();

    BuyPageObject buyPageObject = new BuyPageObject();

    @Step
    public void validateSuccessfulRegistration () throws IOException {
        leerExcelInfoBasica = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaValida");

        String validate = homePageObject.getDriver().findElement(
                registerPageObject.getMsjSuccessfulregistration()).getText();

        Assert.assertEquals("Hola, "+leerExcelInfoBasica.get(0).get("Nombre")+"!", validate);
    }

    @Step
    public void validateUnsuccessfulRegistration (){
        Assert.assertThat(homePageObject.getDriver().findElement(
                registerPageObject.getMsjUnsuccessfulRegistration()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validateLoginSuccessful () throws IOException {
        leerExcelInfoBasica = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaValida");

        String validate = loginPageObject.getDriver().findElement(
                loginPageObject.getMsjLoginSuccess()).getText();

        Assert.assertEquals("Hola, "+leerExcelInfoBasica.get(6).get("Nombre")+"!", validate);
    }
    @Step
    public void validateLoginUnsuccessful (){
        Assert.assertThat(loginPageObject.getDriver().findElement(
                loginPageObject.getMsjLoginUnsuccess()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validateBookSearch (){
        String validate = buyPageObject.getDriver().findElement(buyPageObject.getMsjValidateSearch()).getText();

        Assert.assertEquals("Autor: MUNIZ JAVIER", validate);
    }
    @Step
    public void validateBookQuantity (){
        String validate = buyPageObject.getDriver().findElement(buyPageObject.getMsjValidateQuantity()).getText();

        Assert.assertEquals("Cantidad: 2", validate);
    }

    @Step
    public void validateTotalPrice (){
        String validate = buyPageObject.getDriver().findElement(buyPageObject.getMsjValidateTotal()).getText();

        Assert.assertEquals("TOTAL\n" +
                "$120,000", validate);
    }
}