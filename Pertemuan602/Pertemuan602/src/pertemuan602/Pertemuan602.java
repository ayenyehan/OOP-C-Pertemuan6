/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan602;

import java.util.Scanner;

/**
 *
 * @author Ayen Yehan
 * TGL: 26-04-2025
 */
public class Pertemuan602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi = new Scanner(System.in);
        
        
        System.out.print("Nilai sisi: ");
        int nsisi = insi.nextInt();
        
        Luaspersegi LP = new Luaspersegi(nsisi);
        //LP.sisi = 5;
        
        
        System.out.println("Hitung Luas Persegi");
        System.out.printf("Luas = SISI * SISI\n");
        System.out.printf("     = %d X %d\n", nsisi,nsisi );
        System.out.printf("     = %d\n", LP.HL() );
    }
    
}
