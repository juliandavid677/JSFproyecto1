/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 * Clase que procesa los datos traidos del MostrarController para devolver el 
 * sueldo total
 * @author Germán García
 * @author Julián Parra
 */
public class Logica {

    /**
     * Metodo que calcula el sueldo total de una persona
     * @param sueldo sueldo de una persona  
     * @param dias dias trabajados por una persona
     * @param idiomas idiomas que habla la persona
     * @return sueldoTotal
     */
    public double procesarDatos(double sueldo, int dias, String[] idiomas) {
        double sueldoTotal = 0;
        sueldoTotal = (sueldo * dias);
        for (String idioma : idiomas) {
            if (idioma.equals("Ingles")) {
                sueldoTotal = sueldoTotal + 100000;
            }
            if (idioma.equals("Español")) {
                sueldoTotal = sueldoTotal + 200000;
            }
            if (idioma.equals("Frances")) {
                sueldoTotal = sueldoTotal + 300000;
            }
            if (idioma.equals("Aleman")) {
                sueldoTotal = sueldoTotal + 400000;
            }
        }
        return sueldoTotal;
    }
}
