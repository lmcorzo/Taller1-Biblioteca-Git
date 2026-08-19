package com.mycompany.biblioteca;

public class Cliente extends Persona {

    private String codigoCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, String telefono, String codigoCliente) {
        super(nombre, documento, telefono);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Código de cliente: " + codigoCliente;
    }
}