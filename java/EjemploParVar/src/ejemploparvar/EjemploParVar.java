/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparvar;

/**
 *
 * @author danteNovoa
 */
public class EjemploParVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNumeros(15,34,23,45,6,7,8,9,0,2,3);
    }
    
    public static void imprimirNumeros(int... c){
      int elemento;
        for (int i = 0; i <c.length; i++) {
            elemento =c[i];
            System.out.println("elemento" + elemento);
            
        }
    }
    
}
