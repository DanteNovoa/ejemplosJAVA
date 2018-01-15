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
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
    
        contadorPersonas= 10;
        System.out.println("Ejecuta bloque estàtico");
    } 
    
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona= ++contadorPersonas;
    }
    
    
    Persona(){
        System.out.println("ejecuta constructor");
    }
    
    public int getIdPersona(){
    
        return idPersona;
    }
    
}
