/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author danteNovoa
 */
public class EjemploConversionObjetos {

    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado =new Escritor ("Roy", 15000, TipoEscritura.CLASICO);
        
        imprimirDetalles(empleado);
        
        empleado = new Gerente("Laura", 18000, "Sistemas");
        
        imprimirDetalles(empleado);
        
    }
    
    private static void imprimirDetalles(Empleado empleado){
        String resultado = null;
        
        System.out.println("\nDetalle:" + empleado.obtenerDetalles());
        
        if(empleado instanceof Escritor){
            Escritor escritor =(Escritor) empleado;
            
            resultado = escritor.getTipoDeEscrituraEnTexto();
            
            resultado =((Escritor) empleado).tipoEscritura.getDescripcion();
            System.out.println("resultado tipoEscritura:" + resultado);
        } else if (empleado instanceof Gerente){
            
            resultado =((Gerente) empleado).getDepartamento();
            
            System.out.println("resultado departamento:" + resultado);
        }
    }
    
}
