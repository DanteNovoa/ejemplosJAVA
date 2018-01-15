/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjemplos;

/**
 *
 * @author danteNovoa
 */
public class Ejjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta( "Dante Novoa");
        Cuenta cuenta2= new Cuenta("Fernando", 200);
        
        cuenta1.ingresar(300);
        cuenta2.ingresar(200);
        
        cuenta1.retirar(200);
        cuenta2.retirar(400);
        
        System.out.println(cuenta2 + "" +cuenta1);
    }
    
}
