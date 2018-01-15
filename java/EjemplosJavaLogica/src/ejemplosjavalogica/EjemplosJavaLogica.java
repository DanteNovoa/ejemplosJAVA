/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjavalogica;

/**
 *
 * @author danteNovoa
 */
public class EjemplosJavaLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i= 0;
        
        System.out.println("Serie con For: ");
        for(i=1; i<=10; i++ ){
            if(i <10 ){
                System.out.print( i + ",");
            } else{
                System.out.print(i);
            }
        }
        i=1;
        System.out.println("");
        
        System.out.println("Serie con while:");
        while(i<=10){
            if(i<10){
                System.out.println(i + "");
            }else{
                System.out.println(i);
            }
            i++;
        }
        i=1;
    }
    
}
    

