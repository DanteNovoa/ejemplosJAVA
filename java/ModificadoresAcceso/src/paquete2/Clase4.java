package paquete2;
import paquete1.Clase1;
public class Clase4{

    public Clase4(){
    
        
    }
    
    public void pruebaDesdeClase4(){
        
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico);
        System.out.println("Atributo protegido: No se puede acceder desde un paquete exgerno al no ser una subclase");
        System.out.println(" atributo default no se puede acceder desde un paquete externo");
        System.out.println(" Atributo private:Acceso negado");
        
        new Clase1();
        
        System.out.println("");
        System.out.println("Método publico" + c1.atrPublico);
        System.out.println("Metodo protedigo: No se puede acceder desde un paquete externo al no ser una subclase");
        System.out.println("Mètodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: acceso negado");
        
    }
}
