package com.libreria.nacional.stepsDefinitions;

import com.libreria.nacional.pagesObjects.HomePageObject;
import net.thucydides.core.annotations.Step;

public class HomePageStep {
    HomePageObject homePageObject = new HomePageObject();

    @Step
    public void openBrowser (){
        homePageObject.open();
    }

    @Step
    public void clickMicuenta (){
        homePageObject.getDriver().findElement(
                homePageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void clickRegister (){
        homePageObject.getDriver().findElement(
                homePageObject.getBtnRegistrarme()).click();
    }

    @Step
    public void clickIniciarSesion (){
        homePageObject.getDriver().findElement(
                homePageObject.getBtnIniciarSesion()).click();
    }


}
