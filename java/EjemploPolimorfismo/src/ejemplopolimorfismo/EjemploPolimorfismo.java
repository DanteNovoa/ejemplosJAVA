/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author danteNovoa
 */
public class EjemploPolimorfismo {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Juan" , 1000);
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente("Karla", 2000, "finanzas");
        imprimirDetalles(ger);
    }
    
    public static void imprimirDetalles (Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
    
    
}
