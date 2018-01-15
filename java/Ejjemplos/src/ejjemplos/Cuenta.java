/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjemplos;

/**
 *
 * @author danteNovoa
 */
public class Cuenta {
    private String titular;
    private double  cantidad;
    
    public Cuenta(String titular){
        this(titular , 0);
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular= titular;
        if(cantidad<0){
            this.cantidad=0;
        }else {
            this.cantidad = cantidad;
        }
}
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad= cantidad;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    //ingresar dinero 
    
    public void ingresar( double cantidad){
        if (cantidad>0) {
            this.cantidad+=cantidad;
        } 
    }
    
    public void retirar(double cantidad){
        if(this.cantidad -cantidad <0){
            this.cantidad=0;
        }
    }
    
    public String toString(){
        return "El titular" + titular +"tiene"+ cantidad + "euros en la cuenta";
    }
    
}
