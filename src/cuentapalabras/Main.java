/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentapalabras;

import Tools.Tool;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AARON PLAY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tool tool = new Tool();
        Map<String, Integer> mapaPalabras = tool.CuentaPalabras("Hola bienvenido a esta prueba donde se desarrolla un contador de palabras."
                + " Se ruega probar su veracidad, de acuerdo con lo acordado antes de la prueba");

        for (Map.Entry<String, Integer> entry : mapaPalabras.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + " -- Nº Repeticiones: " + entry.getValue()); 
        }

    }

}
