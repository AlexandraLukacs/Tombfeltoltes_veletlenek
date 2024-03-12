/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombfeltoltes;

import java.util.Scanner;


public class Bekeres {
    //static Scanner sc = new Scanner(System.in, "utf-8");
    //static Scanner sc = new Scanner(System.in, "latin1"); //iso-8859-1
    //static Scanner sc = new Scanner(System.in, "iso-8859-2"); //latin2
    //static Scanner sc = new Scanner(System.in, "windows-1250");
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        /* 1.: programban drótozva: */
        //final int DB = 3;
        
        /* 2.: user dönti el: */
        System.out.print("név db: ");
        final int DB = sc.nextInt();
        String[] nevek = new String[DB];
        sc.nextLine(); // ENTER kiolvasása 
        
        /* feltöltés */
        for (int i = 0; i < DB; i++) {
            System.out.printf(" név (%d/%d): ", i+1, DB);
            String nev = sc.nextLine();
            nevek[i] = nev;
        }
        
        /* kiírás */
        for (int i = 0; i < DB; i++){
            System.out.println(nevek[i]);
        }
        
    }
    
}
