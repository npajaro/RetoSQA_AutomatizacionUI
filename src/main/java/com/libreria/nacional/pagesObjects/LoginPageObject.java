package com.libreria.nacional.pagesObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {
    By btnIngresarConMailYContrasena = By.xpath("//a[@ng-reflect-router-link='/,usuario,iniciar-sesion']//div[@class='d-flex justify-content-between align-content-center border px-2 px-md-3 py-3 shadow-bx']");
    By txtCorreoElectronico = By.xpath("//input[@placeholder='nombre@correo.com']");
    By txtContrasena = By.xpath("//input[@placeholder='Ingresar contraseña']");
    By btnIniciarSesion = By.xpath("//button[contains(text(),'Iniciar sesión')]");
    By msjLoginSuccess = By.xpath("//div[@class='col-12 px-0 text--extrabold text--lgx text--lh-1 text--blue']");
    By msjLoginUnsuccess = By.xpath("//p[@class='text-danger text--xs']");

    public By getBtnIngresarConMailYContrasena() {
        return btnIngresarConMailYContrasena;
    }
    public By getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }
    public By getTxtContrasena() {
        return txtContrasena;
    }
    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
    public By getMsjLoginSuccess() {
        return msjLoginSuccess;
    }
    public By getMsjLoginUnsuccess() {
        return msjLoginUnsuccess;
    }
}
