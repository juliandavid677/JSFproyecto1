/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author shhin
 */
@ManagedBean
@SessionScoped
public class IndexController {

    private String nombre;
    private double sueldo;
    private int dias;
    private String[] idiomas;
    private double sueldoTotal;

    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

}
