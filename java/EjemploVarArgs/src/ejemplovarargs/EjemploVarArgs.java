/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovarargs;

/**
 *
 * @author danteNovoa
 */
public class EjemploVarArgs {

    public static void main(String[] args) {
        imprimirNumeros(12,34,56,7,8,9,0);
        
        System.out.println("");
        imprimirNumerosForEach(14,20,3,24,4,4);
        
        System.out.println("");
        variosParametros("Juan",true, 14, 20, 34);
    }
    
    public static void imprimirNumeros(int... numeros){
     
        int elemento;
        for (int i = 0; i <numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemento" + i + ": "+ elemento);
            
        }
    }
    
    public static void imprimirNumerosForEach(int... numeros){
    
        for(int numero :numeros){
        
            System.out.println("El numero es:" + numero);
        }
    } 
    public static void variosParametros(String nombre, boolean valido, int... numeros){
    
        System.out.println("Nombre:" + nombre);
        System.out.println("Valido:" + nombre);
    }    
}
