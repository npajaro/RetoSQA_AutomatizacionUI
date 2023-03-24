package com.libreria.nacional.stepsDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.libreria.nacional.pagesObjects.LoginPageObject;
import com.libreria.nacional.utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;

public class LoginPageStep {

    private static ArrayList<Map<String, String>> leerExcelInfoBasica = new ArrayList<>();
    private static ArrayList<Map<String, String>> leerExcelInfoClaves = new ArrayList<>();
    LoginPageObject loginPageObject = new LoginPageObject();

    @Step
    public void btnIngresarConMail(){
        loginPageObject.getDriver().findElement(
                loginPageObject.getBtnIngresarConMailYContrasena()).click();
    }
    @Step
    public void enterEmailAndPassword () throws IOException {

        leerExcelInfoBasica = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaValida");
        leerExcelInfoClaves = DatosExcelListas.readExcel("Data.xlsx", "InfoClaves");

        loginPageObject.getDriver().findElement(
                loginPageObject.getTxtCorreoElectronico()).sendKeys(leerExcelInfoBasica.get(6).get("Correo"));

        loginPageObject.getDriver().findElement(
                loginPageObject.getTxtContrasena()).sendKeys(leerExcelInfoClaves.get(8).get("Clave"));
    }
    @Step
    public void clickButtonLogin (){
        loginPageObject.getDriver().findElement(
                loginPageObject.getBtnIniciarSesion()).click();

    }
    @Step
    public void enterEmailAndPasswordInvalid () throws IOException{
        leerExcelInfoBasica = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaNoValida");
        leerExcelInfoClaves = DatosExcelListas.readExcel("Data.xlsx", "InfoClavesInvalid");

        loginPageObject.getDriver().findElement(
                loginPageObject.getTxtCorreoElectronico()).sendKeys(leerExcelInfoBasica.get(1).get("Correo"));

        loginPageObject.getDriver().findElement(
                loginPageObject.getTxtContrasena()).sendKeys(leerExcelInfoClaves.get(1).get("Clave"));
    }

}
