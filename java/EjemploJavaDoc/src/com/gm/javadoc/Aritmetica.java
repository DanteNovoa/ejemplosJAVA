/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.javadoc;

/**
 *
 * @author danteNovoa
 */
public class Aritmetica {
    
    int operandoA;
    int operandoB; 
    
    /**
     * Arriba estàn los operandos
     */
    public Aritmetica(int a, int b){
        this.operandoA = a;
        this.operandoB = b;
    }
    
    /**
     * este mètodo realiza la suma de dos operando enteros
     * @return int resultado de la suma
     *
     */
    
    public int sumar(){
        return operandoA + operandoB;
    }
    
}
