/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl07;

/**
 *
 * @author LOQ
 */
public class SoalUKL07 {

   
        // File: PaketPhotobooth.java (Jika Anda membuatnya di file terpisah)

public class PaketPhotobooth {
    // Data Input
    String nama;
    double biayaProduksiPerEvent;
    double hargaJualPerEvent;
    int jumlahEvent;

    // Data Hasil Perhitungan
    double totalBiayaProduksi;
    double totalPendapatan;
    double labaRugi;
    String status;

    // Constructor untuk inisialisasi
    public PaketPhotobooth(String nama, double biayaPerEvent, double hargaJual, int jumlah) {
        this.nama = nama;
        this.biayaProduksiPerEvent = biayaPerEvent;
        this.hargaJualPerEvent = hargaJual;
        this.jumlahEvent = jumlah;
    }

    // Metode untuk menghitung semua data yang diperlukan
    public void hitungLabaRugi() {
        // 1. Total Biaya Produksi
        this.totalBiayaProduksi = this.biayaProduksiPerEvent * this.jumlahEvent;
        
        // 2. Total Pendapatan
        this.totalPendapatan = this.hargaJualPerEvent * this.jumlahEvent;
        
        // 3. Laba / Rugi
        this.labaRugi = this.totalPendapatan - this.totalBiayaProduksi;
        
        // 4. Status
        if (this.labaRugi > 0) {
            this.status = "Laba";
        } else if (this.labaRugi < 0) {
            this.status = "Rugi";
        } else {
            this.status = "Impas";
        }
    }
}
       
    
    }
