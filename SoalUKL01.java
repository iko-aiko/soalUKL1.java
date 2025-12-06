/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl1;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class SoalUKL1 {         

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("--- Program Deret Fibonacci & Ganjil/Genap ---");
        System.out.print("Masukkan jumlah elemen deret Fibonacci yang diinginkan: ");
        
        System.out.print("Masukkan elemen pertama deret fibonacci : ");
     int Scanner = input.nextInt();

       
        // PERBAIKAN: Gunakan nextInt() untuk membaca integer
        int jumlahElemen = input.nextInt();         

        if (jumlahElemen <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            input.close(); // Tutup Scanner sebelum program berhenti
            return;
        }

        long[] fibonacci = new long[jumlahElemen];
        int hitungGanjil = 0;
        int hitungGenap = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            if (fibonacci[i] % 2 == 0) {
                hitungGenap++;
            } else {
                hitungGanjil++;
            }
        }

        System.out.println("\nDeret Fibonacci dengan " + jumlahElemen + " elemen:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(fibonacci[i]);
            if (i < jumlahElemen - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        System.out.println("--- Hasil Penghitungan ---");
        System.out.println("Jumlah Bilangan Ganjil: " + hitungGanjil + " bilangan");
        System.out.println("Jumlah Bilangan Genap: " + hitungGenap + " bilangan");
        
               // MENUTUP SCANNER untuk menghilangkan peringatan
        input.close(); 
    }
}       
        
    

