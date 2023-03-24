package com.libreria.nacional.pagesObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyPageObject extends PageObject {
    By msjValidateSearch = By.xpath("//div[contains(text(),'Autor: MUNIZ JAVIER')]");
    By hvrCardBook = By.xpath("//a[@class='d-block w-100 h-100']");
    By btnAgregarAlCarrito = By.xpath("//span[contains(text(),'Agregar al carrito')]");
    By btnSeguirComprando = By.xpath("//a[contains(text(),'Seguir comprando')]");
    By btnShoppingCart = By.xpath("//a[@ng-reflect-router-link='/,carrito,mi-carrito']//span//i");
    By btnAddItem = By.xpath("//button[@data-dir='up']");
    By spinnerLoading = By.id("spinner");
    By btnContinuarConLaCompra = By.xpath("//a[@class='btn d-block px-3 py-4 btn-red-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold text-center']");


    By btnAgregarNuevaDireccion = By.xpath("//a[normalize-space()='Agregar nueva dirección']");
    By txtNameAddress = By.xpath("//input[@id='nombre-direccion']");
    By listHousingType = By.xpath("//select[@formcontrolname='tipo_direccion']");
    By txtNames = By.xpath("//div[@ng-reflect-ng-class='[object Object]']//div[@ng-reflect-ng-class='[object Object]']//input[@id='nombres']");
    By txtSurnames = By.xpath("//div[@ng-reflect-ng-class='[object Object]']//div[@ng-reflect-ng-class='[object Object]']//input[@id='apellidos']");
    By txtLandline = By.xpath("//input[@placeholder='Telefono fijo'] ");
    By txtAddress = By.xpath("//input[@id='direccion']");
    By txtNeighborhood = By.xpath("//input[@id='direccion_descripcion']");
    By txtPostalCode = By.xpath("//input[@id='codigo-postal']");
    By listCountry = By.xpath("//select[@name='pais']");
    By listDepartment = By.xpath("//select[@name='departamento']");
    By listCity = By.xpath("//select[@name='ciudad']");
    By btnGuardar = By.xpath("//button[normalize-space()='Guardar']");
    By btnOkModal = By.xpath("//button[normalize-space()='OK']");


    By msjValidateQuantity = By.xpath("//div[@id='accordionPedido']//div[5]");
    By msjValidateTotal = By.xpath("//div[@class='row mx-0 d-flex justify-content-between mt-3']");


    public By getMsjValidateSearch() {
        return msjValidateSearch;
    }
    public By getHvrCardBook() {
        return hvrCardBook;
    }
    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }
    public By getBtnSeguirComprando() {
        return btnSeguirComprando;
    }
    public By getBtnShoppingCart() {
        return btnShoppingCart;
    }
    public By getBtnAddItem() {
        return btnAddItem;
    }
    public By getSpinnerLoading() {
        return spinnerLoading;
    }
    public By getBtnContinuarConLaCompra() {
        return btnContinuarConLaCompra;
    }


    public By getBtnAgregarNuevaDireccion() {
        return btnAgregarNuevaDireccion;
    }
    public By getTxtNameAddress() {
        return txtNameAddress;
    }
    public By getListHousingType() {
        return listHousingType;
    }
    public By getTxtNames() {
        return txtNames;
    }
    public By getTxtSurnames() {
        return txtSurnames;
    }
    public By getTxtLandline() {
        return txtLandline;
    }
    public By getTxtAddress() {
        return txtAddress;
    }
    public By getTxtNeighborhood() {
        return txtNeighborhood;
    }
    public By getTxtPostalCode() {
        return txtPostalCode;
    }
    public By getListCountry() {
        return listCountry;
    }
    public By getListDepartment() {
        return listDepartment;
    }
    public By getListCity() {
        return listCity;
    }
    public By getBtnGuardar() {
        return btnGuardar;
    }
    public By getBtnOkModal() {
        return btnOkModal;
    }


    public By getMsjValidateQuantity() {
        return msjValidateQuantity;
    }
    public By getMsjValidateTotal() {
        return msjValidateTotal;
    }
}
