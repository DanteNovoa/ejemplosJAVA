/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversiones;

/**
 *
 * @author danteNovoa
 */
public class EjemploConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4;
        int b= 5;
        String s= "7";
        double c= 0.5;
        
        a = (int)c; //casteo
        b= Integer.parseInt(s);
    }
    
}
