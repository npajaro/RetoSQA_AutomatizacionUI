package com.libreria.nacional.stepsDefinitions;

import com.libreria.nacional.pagesObjects.BuyPageObject;
import com.libreria.nacional.utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class BuyPageStep {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();
    BuyPageObject buyPageObject = new BuyPageObject();

    @Step
    public void addToCart() {
        WebElement hvrCardBook = buyPageObject.getDriver().findElement(buyPageObject.getHvrCardBook());
        Actions actions = new Actions(buyPageObject.getDriver());
        actions.moveToElement(hvrCardBook).build().perform();

        buyPageObject.getDriver().findElement(buyPageObject.getBtnAgregarAlCarrito()).click();
    }

    @Step
    public void closeModalItems (){
        buyPageObject.getDriver().findElement(
                buyPageObject.getBtnSeguirComprando()).click();
    }

    @Step
    public void clickShoppingCartButton () {
        buyPageObject.getDriver().findElement(
                buyPageObject.getBtnShoppingCart()).click();
    }

    @Step
    public void clickAddItem () {
        WebDriverWait wait = new WebDriverWait(buyPageObject.getDriver(), 10);
        WebElement buttonAddItem = wait.until(ExpectedConditions.visibilityOfElementLocated(buyPageObject.getBtnAddItem()));
        buttonAddItem.sendKeys(Keys.ENTER);
    }

    @Step
    public void clickButtonContinueShopping () {
        WebDriverWait wait = new WebDriverWait(buyPageObject.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(buyPageObject.getSpinnerLoading()));

        buyPageObject.getDriver().findElement(
                buyPageObject.getBtnContinuarConLaCompra()).click();
    }
    @Step
    public void clickAddNewAddress (){
        buyPageObject.getDriver().findElement(
                buyPageObject.getBtnAgregarNuevaDireccion()).click();
    }
    @Step
    public void enterMandatoryData () throws IOException {
        leerExcel = DatosExcelListas.readExcel("Data.xlsx","InfoBasicaValida");

        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtNameAddress()).sendKeys(leerExcel.get(0).get("NombreCasa"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getListHousingType()).sendKeys(leerExcel.get(0).get("TipoVivienda"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtNames()).sendKeys(leerExcel.get(0).get("Nombre"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtSurnames()).sendKeys(leerExcel.get(0).get("Apellido"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtLandline()).sendKeys(leerExcel.get(0).get("TelefonoFijo"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtAddress()).sendKeys(leerExcel.get(0).get("Dirrecion"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtNeighborhood()).sendKeys(leerExcel.get(0).get("Barrio"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getTxtPostalCode()).sendKeys(leerExcel.get(0).get("CodigoPostal"));
        buyPageObject.getDriver().findElement(
                buyPageObject.getListCountry()).sendKeys(leerExcel.get(0).get("Pais"));

        WebDriverWait wait = new WebDriverWait(buyPageObject.getDriver(), 10);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(buyPageObject.getSpinnerLoading()));

        buyPageObject.getDriver().findElement(
                buyPageObject.getListDepartment()).sendKeys(Keys.ENTER + leerExcel.get(0).get("Departamento") + Keys.ENTER);
        //WebElement listDepartm = wait.until(ExpectedConditions.visibilityOfElementLocated(buyPageObject.getListDepartment()));
        //listDepartm.sendKeys(leerExcel.get(0).get("Departamento"));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(buyPageObject.getSpinnerLoading()));

        buyPageObject.getDriver().findElement(
                buyPageObject.getListCity()).sendKeys(Keys.ENTER + leerExcel.get(0).get("Ciudad") + Keys.ENTER);

        //buyPageObject.getDriver().findElement(
        //        buyPageObject.getListCity()).sendKeys(Keys.ENTER + leerExcel.get(0).get("Ciudad") + Keys.ENTER);
        //WebElement listCity = wait.until(ExpectedConditions.visibilityOfElementLocated(buyPageObject.getListCity()));
        //listCity.sendKeys(Keys.ENTER + leerExcel.get(0).get("Ciudad") + Keys.ENTER);
    }
    @Step
    public void clickSaveButton(){
        buyPageObject.getDriver().findElement(
                buyPageObject.getBtnGuardar()).click();
    }

    @Step
    public void clickCloseModal(){
        WebDriverWait wait = new WebDriverWait(buyPageObject.getDriver(), 10);
        WebElement btnOK = wait.until(ExpectedConditions.visibilityOfElementLocated(buyPageObject.getBtnOkModal()));
        btnOK.sendKeys(Keys.ENTER);
    }
}
