package com.libreria.nacional.models;

public class DatosLogin {

    String usuario;
    String clave;

    public DatosLogin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
