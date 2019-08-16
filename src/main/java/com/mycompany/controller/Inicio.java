/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * Clase de inicio que devuelve la pagina de mostrar 
 * @author Germán García
 * @author Julián Parra
 */
@Named(value = "inicio")
@RequestScoped
public class Inicio {
    
    /**
     * Metodo que devuelve la pagina que debo mostrar los datos de una persona
     * @return mostrar
     */
    public  String inicioMostrar() {
        return "mostrar?faces-redirect=true";
    }
}
