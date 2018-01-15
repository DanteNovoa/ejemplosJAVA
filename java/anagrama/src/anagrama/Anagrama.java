/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author danteNovoa
 */
public class Anagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase1 ="hola roma";
        String frase2 ="halo amor";
        
        char[] ordenada1 = frase1.toCharArray();
        java.util.Arrays.sort(ordenada1);
        String cadena1 = new String(ordenada1);
        
        char[] ordenada2 = frase2.toCharArray();
        java.util.Arrays.sort(ordenada2);
        String cadena2 = new String(ordenada2);
        
        if(cadena1.equals(cadena2)) System.out.println("son anagramas");
        else System.out.println("no son anargamas");
        
    }
    
}
