/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AARON PLAY
 */
public class Tool {

    public Map<String, Integer> CuentaPalabras(String frase) {

        String[] palabras = frase.replace("."," ").replace(","," ").replace(";"," ").replace("  "," ").split(" ");
        Map<String, Integer> mapaFrases = new HashMap<>();

        for (String palabra : palabras) {
            if (mapaFrases.containsKey(palabra)) {
                mapaFrases.put(palabra, mapaFrases.get(palabra) + 1);
            } else {
                mapaFrases.put(palabra, 1);
            }
        }
        
        return mapaFrases;
    }

}
