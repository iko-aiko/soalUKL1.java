/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl6;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class SoalUKL6 {

    public static void main(String[] args) {
        
        // Gunakan try-with-resources untuk Scanner
        try (Scanner input = new Scanner(System.in)) {
            
            // DecimalFormat untuk menampilkan angka dengan pemisah ribuan
            DecimalFormat df = new DecimalFormat("#,###");

            System.out.println("=========================================");
            System.out.println("     PROGRAM HITUNG TAGIHAN LISTRIK      ");
            System.out.println("=========================================");

            // 1. Input Data Pelanggan
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = input.nextLine();
            
            System.out.print("Masukkan Golongan Listrik (A, B, atau C): ");
            // Ambil input dan ubah ke huruf kapital untuk memudahkan pengecekan
            String golonganStr = input.nextLine().toUpperCase();
            
            System.out.print("Masukkan Jumlah Pemakaian (dalam kWh): ");
            double pemakaianKwh = input.nextDouble();
            
            // 2. Inisialisasi Variabel Perhitungan
            double tarifPerKwh = 0.0;
            double biayaTambahanPersen = 0.10; // 10%
            double totalTagihan;
            double tagihanSebelumTambahan;
            double biayaTambahan = 0.0;
            
            // 3. Menentukan Tarif per kWh menggunakan SWITCH
            switch (golonganStr) {
                case "A":
                    tarifPerKwh = 1200.0;
                    break;
                case "B":
                    tarifPerKwh = 1500.0;
                    break;
                case "C":
                    tarifPerKwh = 1800.0;
                    break;
                default:
                    System.out.println("\nERROR: Golongan listrik tidak valid. Harap masukkan A, B, atau C.");
                    return; // Menghentikan program
            }
            
            // 4. Menghitung Total Tagihan Dasar
            tagihanSebelumTambahan = pemakaianKwh * tarifPerKwh;
            totalTagihan = tagihanSebelumTambahan; // Nilai awal
            
            // 5. Menerapkan Biaya Tambahan (Syarat: Pemakaian > 500 kWh)
            if (pemakaianKwh > 500) {
                // Biaya tambahan = 10% dari Tagihan Sebelum Tambahan
                biayaTambahan = tagihanSebelumTambahan * biayaTambahanPersen;
                totalTagihan = tagihanSebelumTambahan + biayaTambahan;
            }

            // 6. Menampilkan Output Hasil
            System.out.println("\n============== DETAIL TAGIHAN ==============");
            System.out.println("Nama Pelanggan        : " + namaPelanggan);
            System.out.println("Golongan Listrik      : " + golonganStr + " (Rp " + df.format(tarifPerKwh) + " / kWh)");
            System.out.println("Pemakaian Listrik     : " + df.format(pemakaianKwh) + " kWh");
            System.out.println("Tagihan Dasar         : Rp " + df.format(tagihanSebelumTambahan));
            
            // Tampilkan Biaya Tambahan hanya jika ada
            if (biayaTambahan > 0) {
                System.out.println("Biaya Tambahan (10%)  : Rp " + df.format(biayaTambahan));
            }
            
            System.out.println("--------------------------------------------");
            System.out.println("Total Tagihan Akhir   : Rp " + df.format(totalTagihan));
            System.out.println("============================================");

        } catch (java.util.InputMismatchException e) {
            System.out.println("\nERROR: Input pemakaian harus berupa angka.");
        } catch (Exception e) {
            System.out.println("\nTerjadi kesalahan tak terduga.");
        }
    }
}

