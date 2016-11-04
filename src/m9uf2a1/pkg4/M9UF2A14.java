/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m9uf2a1.pkg4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ALUMNEDAM
 */
public class M9UF2A14 {
    private static int[] sous = new int[20000];
    private static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        Sum.sumArray(sous);
        imprimirArray();
    }
   public static int[] omplirArray() {
        for(int i=0;i<sous.length;i++) {
            sous[i]=rand.nextInt((50000 - 0) + 1);
        }
        return sous;
    }
   public static void imprimirArray() {
       for(int i=0;i<sous.length;i++) {
           System.out.println(sous[i]);
       }
   }
}

  