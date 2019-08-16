/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Logica;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * ManagedBean que llama al IndexController para hacer la operación del sueldo y
 * volverla a mostrar
 * @author Germán García
 * @author Julián Parra
 */
@ManagedBean
@RequestScoped
public class MostrarController {
    
    /**
     * Un ManagedProperty para recuperar los datos optenedios en el indexController
     */
    @ManagedProperty("#{indexController}")
    
    /**
     * Variable para llamar al indexController
     */
    private IndexController index;
    
    /**
     * Variable que llama a la clase logica
     */
    private Logica logica;

    /**
     * Variable que guarda el sueldo total
     */
    private Double sueldoTotal;

    /**
     * Constructor para iniciarlizar la clase logica
     */
    public MostrarController() {
        logica = new Logica();
    }

    /**
     * Get para leer las variables que trae el index
     * @return index
     */
    public IndexController getIndex() {
        return index;
    }

    /**
     * Set para guardar las variables que trae el index
     * @param index 
     */
    public void setIndex(IndexController index) {
        this.index = index;
    }

    /**
     * Get para leer la variable de sueldoTotal
     * @return sueldoTotal
     */
    public Double getSueldoTotal() {
        return sueldoTotal;
    }

    /**
     * Set oara guardar el sueldoTotal
     * @param sueldoTotal 
     */
    public void setSueldoTotal(Double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    /**
     * Metodo que se inicia antes de cargar mostrar.xhtml y llama a la clase para
     * hacer la operación del sueldo total de una persona
     */
    public void sueldo() {
        try {
            this.sueldoTotal = logica.procesarDatos(index.getSueldo(), index.getDias(), index.getIdiomas());
        } catch (Exception e) {
            System.out.println("=======ERROR=========");
//            System.out.println(e);
        }
    }

}
