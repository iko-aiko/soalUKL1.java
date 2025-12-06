/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl3;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class SoalUKL3 {

    public static void main(String[] args) {
        // --- 1. Meminta Input ---
        Scanner scanner = new Scanner(System.in);
        int bilangan;
        

        System.out.println("--- Program Penghitung Faktorial ---");
        System.out.print("Masukkan sebuah bilangan bulat non-negatif: ");

        // Validasi input
        if (scanner.hasNextInt()) {
            bilangan = scanner.nextInt();

            if (bilangan < 0) {
                System.out.println("Faktorial hanya didefinisikan untuk bilangan non-negatif.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
            scanner.close();
            return;
        }

        // --- 2. Menghitung Faktorial ---
        
        // Menggunakan tipe data long untuk menampung hasil yang besar 
        // karena faktorial tumbuh sangat cepat (e.g., 20! sudah lebih dari batas int).
        long hasilFaktorial = 1; 
        
        // Menampilkan proses perhitungan
        String prosesPerkalian = "";

        if (bilangan == 0) {
            // Kasus khusus 0! = 1
            prosesPerkalian = "1";
        } else {
            // Perulangan untuk menghitung faktorial
            for (int i = bilangan; i >= 1; i--) {
                hasilFaktorial *= i; // hasilFaktorial = hasilFaktorial * i
                
                // Membuat string proses perkalian untuk ditampilkan
                prosesPerkalian += i;
                if (i > 1) {
                    prosesPerkalian += " x ";
                }
            }
        }
        
        // --- Menampilkan Hasil ---
        System.out.println("\n--- HASIL ---");
        System.out.println("Bilangan yang dimasukkan: " + bilangan);
        System.out.println(bilangan + "! = " + prosesPerkalian);
        System.out.println("Hasil Faktorialnya adalah: " + hasilFaktorial);
        System.out.println("-------------");

        scanner.close();
    }
}
        
    

