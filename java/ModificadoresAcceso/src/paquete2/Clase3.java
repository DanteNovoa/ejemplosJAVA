/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Clase1;


/**
 *
 * @author danteNovoa
 */
public class Clase3 extends Clase1 {
    
    public Clase3(){
        super(1,2);
    }
    
    public void pruebaDesdeClase3(){
        
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico + "o heredado:" + atrPublico);
        System.out.println("Atributo protegido (heredado):" + atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo private: Acceso negado");
        
        new Clase1();
        
        System.out.println("");
        System.out.println("Método público:" +c1.metodoPublico());
        System.out.println("Método protegido (heredado):" + metodoProtegido());
        System.out.println("Método default : no se puede acceder desde un paquete externo");
        System.out.println("Metodo private: acceso negado");
    }
    
}
