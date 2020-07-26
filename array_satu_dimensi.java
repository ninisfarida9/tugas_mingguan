/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201147_ninis_tugas_mingguan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class array_satu_dimensi {
    public static void main(String[] args) {
        int NH[] = new int [3];
        int NBTQ[] = new int [3];
        int NUAM[] = new int [3];
        String[] santri = new String[3];
        int NA;
        //NH= nilai hafalan, NBTQ= nilai baca tulis qur'an
        //NUAM= nilai ujian akhir marhala, NA= nilai akhir
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <santri.length; i++){
            System.out.println("-----------------------");
            System.out.print("Input Nama Santri ke-" + (i+1) + " = ");
            santri[i] = input.next();
            System.out.println("-----------------------");
            System.out.print("Nilai hafalan = ");
            NH[i] = input.nextInt();
            System.out.print("Nilai Baca Tulis Qur'an = ");
            NBTQ[i] = input.nextInt();
            System.out.print("Nilai Ujian Akhir Marhala = ");
            NUAM[i] = input.nextInt();
            System.out.print("-------------------------");
            
            NA = (int) ((NH[i]*0.2) + (NBTQ[i]*0.3) + (NUAM[i]*0.5));
            System.out.println("Nilai Akhir : " + NA);
            
            
            
            
        }
            
        
        
        
    }
}

     
          
