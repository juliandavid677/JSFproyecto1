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
 *
 * @author shhin
 */
@ManagedBean
@RequestScoped
public class MostrarController {

    private Logica logica;
    private Double sueldoTotal;
    IndexController ver = new IndexController();
    Double ahs = ver.getSueldo();
    
    @ManagedProperty("#{indexController}")
    private IndexController index;

    /**
     * Creates a new instance of MostrarController
     */
    public MostrarController() {
        logica = new Logica();
    }

    public IndexController getIndex() {
        return index;
    }

    public void setIndex(IndexController index) {
        this.index = index;
    }

    public Double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(Double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public void sueldo() {
        try {
            System.out.println("===ERROR ENTRADA=" + ahs);
            this.sueldoTotal = logica.procesarDatos(index.getSueldo(), index.getDias(), index.getIdiomas());
        } catch (Exception e) {
            System.out.println("=======ERROR=========");
            System.out.println(e);
        }
    }

}
