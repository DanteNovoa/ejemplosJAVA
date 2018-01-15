/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach2;

/**
 *
 * @author danteNovoa
 */
public class ForEach2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona [] personas ={new Persona("Juan"), new Persona("Karla")};
       
       for(Persona p: personas){
       
           String nombre= p.getNombre();
           System.out.println("Nombre persona: "+" "+nombre);
       }
       
        System.out.println("");
        
        int[] edades= {15, 20, 41, 50};
        
        for(int edad: edades){
        
            System.out.println("Edad:" + edad);
        }
    }
    
}
