/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquescodigo;

/**
 *
 * @author danteNovoa
 */
public class BloquesCodigo {

    public static void main(String[] args) {
        Persona p1 =new Persona();
        Persona p2 = new Persona();
        int id = p1.getIdPersona();
        int id2 = p2.getIdPersona();
        System.out.println("id Persona: "+id+ "segundo id"+id2);
       
    }
    
}
