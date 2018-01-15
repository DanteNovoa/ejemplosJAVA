/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachapp;

/**
 *
 * @author danteNovoa
 */
public class ForEachApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNumerosFor(12,34,45,67,81,23,23);
    }
    
    public static void imprimirNumerosFor(int... numeros){
    
        for(int numero:numeros){
            System.out.println("numeros" +" "+ numero);
        }
    }
}
