/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author shhin
 */
public class Logica {

    public double procesarDatos(double sueldo, int dias, String[] idiomas) {
        double sueldoTotal = 0;
        sueldoTotal = (sueldo * dias);
//        for (String idioma : idiomas) {
//            if (idioma.equals("Ingles")) {
//                sueldoTotal = sueldoTotal + 100000;
//            }
//        }
        System.out.println("===ERROR PROCESAR DATOS=====" + sueldoTotal);
        return sueldoTotal;
    }
}
