package com.mycompany.escuela;

public class Estudiante {

    private int clave;
    private String nombres;
    private String apellidos;

    public Estudiante(int clave, String nombres, String apellidos) {
        this.clave = clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}