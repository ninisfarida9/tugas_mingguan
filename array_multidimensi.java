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
public class array_multidimensi {
    public static void main(String[] args) {
        //membuat array dan scanner
        String[][] meja = new String[2][3];
        Scanner input = new Scanner(System.in);
       
        //mengisi setiap mejaa
        for(int i = 0; i < meja.length; i++){
            for(int j = 0; j < meja[i].length; j++){
                System.out.format("siapa yang akan duduk di meja (%d,%d): ", i, j);
                meja[i][j] = input.next();
                
                
            }
        }
        //menampilkan isi array
        System.out.println("-----------------------");
        for(int baris = 0; baris < meja.length; baris++){
            for(int kolom = 0; kolom < meja[baris].length; kolom++){
                System.out.format("| %s | \t",meja[baris][kolom]);
            }
            System.out.println("");
            
            
        }
        System.out.println("-------------------------");
    }
    
}
