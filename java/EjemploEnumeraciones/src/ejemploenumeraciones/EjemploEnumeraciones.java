/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author danteNovoa
 */
public class EjemploEnumeraciones {

    public static void main(String[] args) {
     
        System.out.println("Valor 1: " + Dias.LUNES);
        indicarDia(Dias.VIERNES);
        
        System.out.println("Continente no.4: " + Continentes.AMERICA);
        System.out.println("Paises en América: "+ Continentes.AMERICA.getPaises());
        
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias){
    
        switch (dias){
        
            case LUNES: 
                System.out.println("Primer día de la semana");
                break;
            case MARTES: 
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES: 
                System.out.println("Tercer día de la semana");
                break;
            default:
                System.out.println("no se encontró el día especificado");
        }
    }
    
    public static void indicarPaises(Continentes continentes){
    
        switch (continentes){
        
            case AFRICA:
                System.out.println("No. Paises en: " + continentes + ": "+ continentes.getPaises());
                break;
            default:
                System.out.println("y asì, con los demàs continentes");
        }
    }
    
    public static void imprimirContinentes(){
    
       for(Continentes c: Continentes.values()){
       
           System.out.println("Continente: " + c + "contiene" + c.getPaises() + "paises.");
       }
    }
    
}
