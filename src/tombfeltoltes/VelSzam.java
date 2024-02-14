/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombfeltoltes;

import java.util.Random;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class VelSzam {
    
    static Random rnd = new Random();

    //psvm tab
    public static void main(String[] args) {
        final int DB = 5;
        int[] korok = new int[3];
        /* feltöltés */
        for (int i = 0; i < DB; i++) {
            korok[i] = (int) (Math.random()*100); //0...99
            //korok[i] = rnd.nextInt(); //Integer.MIN_VALUE...Integer.MAX_VALUE
            //korok[i] = rnd.nextInt(100); //0...99
            //korok[i] = rnd.nextInt(15, 48); //15...471
            
        }
        
        /* kiírás */
        for (int i = 0; i < DB; i++) {
            System.out.println(korok[i]);
            
        }
        
    }
    
}
