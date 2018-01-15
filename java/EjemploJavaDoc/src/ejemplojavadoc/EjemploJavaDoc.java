/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;
import com.gm.javadoc.Aritmetica;

/**
 *
 * @author danteNovoa
 */
public class EjemploJavaDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = new Aritmetica(3,2).sumar() ;
        
        System.out.println("resultado"+ resultado);
    }
    
}
