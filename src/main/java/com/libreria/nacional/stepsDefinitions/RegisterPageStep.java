package com.libreria.nacional.stepsDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.libreria.nacional.pagesObjects.RegisterPageObject;
import com.libreria.nacional.utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;



public class RegisterPageStep {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();
    private static ArrayList<Map<String, String>> leerExcelClaves = new ArrayList<>();
    private static ArrayList<Map<String, String>> leerExcelInfoBasica = new ArrayList<>();
    private static ArrayList<Map<String, String>> leerExcelInfoClaves = new ArrayList<>();

    RegisterPageObject registerPageObject = new RegisterPageObject();

    @Step
    public void enterDataValid() throws IOException {

        leerExcelInfoBasica = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaValida");
        leerExcelInfoClaves = DatosExcelListas.readExcel("Data.xlsx", "InfoClaves");

        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtCorreo()).sendKeys(leerExcelInfoBasica.get(0).get("Correo"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtNombre()).sendKeys(leerExcelInfoBasica.get(0).get("Nombre"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtApellido()).sendKeys(leerExcelInfoBasica.get(0).get("Apellido"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getListTipoDocuemento()).sendKeys(leerExcelInfoBasica.get(0).get("TipoDocumento"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtNumeroDocuemento()).sendKeys(leerExcelInfoBasica.get(0).get("NumeroDocuemento"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtTelefonoCelular()).sendKeys(leerExcelInfoBasica.get(0).get("TelefonoCelular"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtTelefonoFIjo()).sendKeys(leerExcelInfoBasica.get(0).get("TelefonoFijo"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getPssClave()).sendKeys(leerExcelInfoClaves.get(0).get("Clave"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getPssConfirmarClave()).sendKeys(leerExcelInfoClaves.get(0).get("ConfirmacionClave"));
    }

    @Step
    public void enterData () throws IOException {

    }

    @Step
    public void aceptPrivacyPolicy (){
        registerPageObject.getDriver().findElement(
                registerPageObject.getCheckPoliticas()).click();
    }

    @Step
    public void clickButtonRegister (){
        registerPageObject.getDriver().findElement(
                registerPageObject.getBtnRegistrarme()).click();
    }

    @Step
    public void enterDataInvalid() throws IOException{
        leerExcel = DatosExcelListas.readExcel("Data.xlsx", "InfoBasicaNoValida");
        leerExcelClaves = DatosExcelListas.readExcel("Data.xlsx", "InfoClavesInvalid");

        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtCorreoInvalid()).sendKeys(leerExcel.get(0).get("Correo"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtNombreInvalid()).sendKeys(leerExcel.get(0).get("Nombre"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtApellidoInvalid()).sendKeys(leerExcel.get(0).get("Apellido"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getListTipoDocuementoInvalid()).sendKeys(leerExcel.get(0).get("TipoDocumento"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtNumeroDocuementoInvalid()).sendKeys(leerExcel.get(0).get("NumeroDocuemento"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtTelefonoCelularInvalid()).sendKeys(leerExcel.get(0).get("TelefonoCelular"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtTelefonoFIjoInvalid()).sendKeys(leerExcel.get(0).get("TelefonoFijo"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getPssClaveInvalid()).sendKeys(leerExcelClaves.get(0).get("Clave"));
        registerPageObject.getDriver().findElement(
                registerPageObject.getPssConfirmarClaveInvalid()).sendKeys(leerExcelClaves.get(0).get("ConfirmacionClave"));

    }

    @Step
    public void searchBook() {
        registerPageObject.getDriver().findElement(
                registerPageObject.getBtnBuscar()).click();

        registerPageObject.getDriver().findElement(
                registerPageObject.getTxtBuscar()).sendKeys("Android Manual Práctico para todos los Niveles");

        registerPageObject.getDriver().findElement(
               registerPageObject.getTxtBuscar()).sendKeys(Keys.ENTER);


    }

}
