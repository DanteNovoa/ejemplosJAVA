/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadafuncion;

/**
 *
 * @author danteNovoa
 */
public class LlamadaFuncion {
    static int multiplicaPorTres(int p){
        int r = p *3;
        return r;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = multiplicaPorTres(a); 
    }
    
}
