/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author danteNovoa
 */
public class NumerosPrimos {
    static boolean esPrimo(int n){
      boolean esprimo=true;
      int i=2;
      
      while(i<n){
      
          if (n%i==0) {
              esprimo=false;
              i++;
          }
      }
      
      
      return esprimo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 1000; i++) {
            if( esPrimo(i))
                System.out.println(i);
            
        }
    }
    
}
