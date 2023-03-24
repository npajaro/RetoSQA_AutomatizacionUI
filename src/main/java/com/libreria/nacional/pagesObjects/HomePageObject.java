package com.libreria.nacional.pagesObjects;


import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://librerianacional.com/")
public class HomePageObject extends PageObject {
    By btnMiCuenta = By.xpath("//div[@class='row mx-0']//button[@id='dropdownMenuLogin']");
    By btnRegistrarme = By.xpath("//div[@class='dropdown-menu dropdown-menu-right dropdown-menu-login m-0 bg-white border-radius-0 px-3 show']//a[@class='d-flex justify-content-between align-items-center dropdown-item text--blue text--xm px-0'][normalize-space()='Registrarme']");
    By btnIniciarSesion = By.xpath("//div[@class='dropdown-menu dropdown-menu-right dropdown-menu-login m-0 bg-white border-radius-0 px-3 show']//a[@class='d-flex justify-content-between align-items-center dropdown-item text--blue text--xm px-0'][normalize-space()='Iniciar Sesión']");


    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
    public By getBtnRegistrarme() {
        return btnRegistrarme;
    }
    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
