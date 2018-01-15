/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author danteNovoa
 */
public class Clase2 {
    
    public Clase2(){
        System.out.println("");
        
        new Clase1(1);
        
        new Clase1(1,2);
        
        new Clase1(1,2,3);
        
        System.out.println("Constructor private: Acceso negado");
    }
    
    public void pruebaDesdeClase2(){
        
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico);
        System.out.println("Atributo protegido:" + c1.atrProtegido);
        System.out.println("Atributo default" + c1.atrPaquete);
        System.out.println("Atributo private: no se puede acceder porqué es private");
        
        
        System.out.println("");
        System.out.println("Método publico:" + c1.metodoPublico());
        System.out.println("Método protegido:" + c1.metodoProtegido());
        System.out.println("Método default" + c1.metodoPaquete());
        System.out.println("Método private: no se puede acceder porqué es private");
        
    }
    
}
