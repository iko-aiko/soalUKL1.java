/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl4;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class SoalUKL4 {

    public static void main(String[] args) {
        
        // 1. Persiapan: Random Number Generator dan Scanner
        // Menggunakan try-with-resources untuk memastikan Scanner tertutup dan menghilangkan warning.
        try (Scanner input = new Scanner(System.in)) {
            
            // Inisialisasi generator angka acak
            Random random = new Random();
            
            // Menghasilkan angka acak antara 1 hingga 100 (batas atas 101 eksklusif)
            int angkaRahasia = random.nextInt(100) + 1; 
            
            // ArrayList untuk menyimpan semua tebakan
            ArrayList<Integer> daftarTebakan = new ArrayList<>();
            
            int tebakanPengguna;
            boolean isMenang = false;

            System.out.println("=========================================");
            System.out.println("      PROGRAM PERMAINAN TEBAK ANGKA      ");
            System.out.println("=========================================");
            System.out.println("Komputer telah memilih angka antara 1 dan 100.");
            System.out.println("Tebaklah angka tersebut!");
            
            // 2. Perulangan Utama Permainan
            // Loop akan terus berjalan selama isMenang masih false
            while (!isMenang) { 
                System.out.print("\nMasukkan tebakan Anda: ");
                
                // Pengecekan untuk memastikan input adalah integer
                if (input.hasNextInt()) {
                    tebakanPengguna = input.nextInt();
                    
                    // Tambahkan tebakan pengguna ke dalam ArrayList
                    daftarTebakan.add(tebakanPengguna); 

                    // 3. Logika Pengecekan Tebakan
                    if (tebakanPengguna == angkaRahasia) {
                        isMenang = true; // Permainan selesai
                        System.out.println("\nSELAMAT! Anda berhasil menebak angka " + angkaRahasia + "!");
                    } else if (tebakanPengguna < angkaRahasia) {
                        System.out.println("Tebakan terlalu rendah. Coba lagi.");
                    } else { // tebakanPengguna > angkaRahasia
                        System.out.println("Tebakan terlalu tinggi. Coba lagi.");
                    }
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
                    input.next(); // Membersihkan sisa input yang salah (misal: huruf)
                }
            } // Akhir dari while loop

            // 4. Menampilkan Hasil Akhir
            System.out.println("\n-----------------------------------------");
            System.out.println("  Riwayat Tebakan (" + daftarTebakan.size() + " kali):");
            // Menampilkan isi ArrayList secara langsung
            System.out.println(daftarTebakan); 
            System.out.println("-----------------------------------------");

        } catch (Exception e) {
            // Menangkap kesalahan tak terduga, misal input yang terlalu besar
            System.out.println("Terjadi kesalahan tak terduga. Program dihentikan.");
        }
    }
}
    

