package com.libreria.nacional.pagesObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPageObject extends PageObject {
    By txtCorreo = By.xpath("//input[@id='email']");
    By txtNombre = By.xpath("//input[@id='nombres']");
    By txtApellido = By.xpath("//input[@id='apellidos']");
    By listTipoDocuemento = By.xpath("//select[@name='tipo_identificacion']");
    By txtNumeroDocuemento = By.xpath("//input[@id='identificacion']");
    By txtTelefonoCelular = By.xpath("//input[@id='telefono_movil']");
    By txtTelefonoFIjo = By.xpath("//input[@id='telefono']");
    By pssClave = By.xpath("//input[@id='contrasena']");
    By pssConfirmarClave = By.xpath("//input[@id='repeatContrasena']");
    By checkPoliticas = By.xpath("//input[@id='terminosCondiciones']");
    By btnRegistrarme = By.xpath("//button[contains(text(),'Registrarme')]");
    By btnBuscar = By.xpath("//div[@class='form-group form-search-content d-flex mb-0 h-100']//button[@type='button']");
    By txtBuscar = By.xpath("//form[@ng-reflect-form='[object Object]']//div[@ng-reflect-ng-class='[object Object]']//input[@placeholder='Buscar…']");


    By txtCorreoInvalid = By.xpath("//input[@id='email']");
    By txtNombreInvalid = By.xpath("//input[@id='nombres']");
    By txtApellidoInvalid = By.xpath("//input[@id='apellidos']");
    By listTipoDocuementoInvalid = By.xpath("//select[@name='tipo_identificacion']");
    By txtNumeroDocuementoInvalid = By.xpath("//input[@id='identificacion']");
    By txtTelefonoCelularInvalid = By.xpath("//input[@id='telefono_movil']");
    By txtTelefonoFIjoInvalid = By.xpath("//input[@id='telefono']");
    By pssClaveInvalid = By.xpath("//input[@id='contrasena']");
    By pssConfirmarClaveInvalid = By.xpath("//input[@id='repeatContrasena']");





    By msjSuccessfulregistration = By.xpath("//div[@class='col-12 px-0 text--extrabold text--lgx text--lh-1 text--blue']");
    By msjUnsuccessfulRegistration = By.xpath("//div[@class='text-danger text--xs mb-2']");



    public By getTxtCorreo() {
        return txtCorreo;
    }
    public By getTxtNombre() {
        return txtNombre;
    }
    public By getTxtApellido() {
        return txtApellido;
    }
    public By getListTipoDocuemento() {
        return listTipoDocuemento;
    }
    public By getTxtNumeroDocuemento() {
        return txtNumeroDocuemento;
    }
    public By getTxtTelefonoCelular() {
        return txtTelefonoCelular;
    }
    public By getTxtTelefonoFIjo() {
        return txtTelefonoFIjo;
    }
    public By getPssClave() {
        return pssClave;
    }
    public By getPssConfirmarClave() {
        return pssConfirmarClave;
    }
    public By getCheckPoliticas() {
        return checkPoliticas;
    }
    public By getBtnRegistrarme() {
        return btnRegistrarme;
    }
    public By getTxtBuscar() {
        return txtBuscar;
    }
    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtCorreoInvalid() {
        return txtCorreoInvalid;
    }
    public By getTxtNombreInvalid() {
        return txtNombreInvalid;
    }
    public By getTxtApellidoInvalid() {
        return txtApellidoInvalid;
    }
    public By getListTipoDocuementoInvalid() {
        return listTipoDocuementoInvalid;
    }
    public By getTxtNumeroDocuementoInvalid() {
        return txtNumeroDocuementoInvalid;
    }
    public By getTxtTelefonoCelularInvalid() {
        return txtTelefonoCelularInvalid;
    }
    public By getTxtTelefonoFIjoInvalid() {
        return txtTelefonoFIjoInvalid;
    }
    public By getPssClaveInvalid() {
        return pssClaveInvalid;
    }
    public By getPssConfirmarClaveInvalid() {
        return pssConfirmarClaveInvalid;
    }

    public By getMsjSuccessfulregistration() {
        return msjSuccessfulregistration;
    }

    public By getMsjUnsuccessfulRegistration() {
        return msjUnsuccessfulRegistration;
    }
}
