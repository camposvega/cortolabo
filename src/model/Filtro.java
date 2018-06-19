/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    private String inscripcion;
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private boolean estado;

    public Filtro(String inscripcion, String nombre, String propietario, int edad, String raza, boolean estado) {
        this.inscripcion = inscripcion;
        this.nombre = nombre;
        this.propietario = propietario;
        this.edad = edad;
        this.raza = raza;
        this.estado = estado;
    }

    public Filtro() {
    }

    public String getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(String inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
        
}
