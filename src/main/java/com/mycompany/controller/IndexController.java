/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * ManagedBean que inicializa las variables a utilizar en el index
 * @author Germán García
 * @author Julián Parra
 */
@ManagedBean
@SessionScoped
public class IndexController {

    /**
     * Almacena el nombre de la persona
     */
    private String nombre;
    
    /**
     * Almacena el sueldo de la persona
     */
    private double sueldo;
    
    /**
     * Almacena los días trabajados por una persona
     */
    private int dias;
    
    /**
     * Almacena los idiomas que habla esa persona
     */
    private String[] idiomas;
    
    /**
     * Almacena el suelto total de una persona
     */
    private double sueldoTotal;
    
    /**
     * Retorna el nombre de una persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Guarda el nombre de una persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Retorna el sueldo de una persona
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }
    
    /**
     * Guarda el sueldo de una persona
     * @param sueldo 
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Retorna los días trabajados por una persona
     * @return dias
     */
    public int getDias() {
        return dias;
    }
    
    /**
     * Guarda los días trabajados de una persona
     * @param dias 
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * Retorna los idiomas de habla una persona
     * @return idiomas
     */
    public String[] getIdiomas() {
        return idiomas;
    }
    
    /**
     * Guarda los idiomas que habla una persona
     * @param idiomas 
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
}
