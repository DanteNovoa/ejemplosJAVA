/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author danteNovoa
 */
public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***Acceso desde Clase 2 a Clase 1(mismo paquete)***");
        new Clase2().pruebaDesdeClase2();
        
        System.out.println("\n***Acceso desde Clase a Clase 1 (diferente paquete, pero es subclase)***");
        new Clase3().pruebaDesdeClase3();
        
        System.out.println("\n***Acceso desde Clase 4 a Clase (diferente paquete, NO es subclase)***");
        new Clase4().pruebaDesdeClase4();
         
    }
    
}
