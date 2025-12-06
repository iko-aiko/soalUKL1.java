/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl5;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.HashMap;  
import java.util.Map;
public class SoalUKL5 {

    public static void main(String[] args) {
        
        // 1. Array Input Sesuai Soal
        int[] dataArray = {1, 2, 2, 3, 3, 3, 4};
        
        // HashMap untuk menyimpan frekuensi. Key=Elemen, Value=Hitungan.
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        System.out.println("--- Program Menghitung Frekuensi Array ---");
        System.out.print("Array Input: {");
        // Loop sederhana untuk menampilkan Array Input
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + (i < dataArray.length - 1 ? ", " : ""));
        }
        System.out.println("}");
        System.out.println("----------------------------------------");


        // 2. Loop Utama: Menghitung Frekuensi
        for (int elemen : dataArray) {
            
            // Logika Inti HashMap:
            // 1. Cek apakah elemen sudah ada sebagai Kunci di dalam Map
            if (frekuensiMap.containsKey(elemen)) {
                // Jika sudah ada, ambil nilai hitungan lama (Value)
                int hitunganLama = frekuensiMap.get(elemen);
                // Tambahkan 1 ke hitungan lama, lalu simpan kembali (timpa)
                frekuensiMap.put(elemen, hitunganLama + 1);
            } else {
                // Jika elemen belum ada, masukkan elemen sebagai Kunci baru
                // dan atur hitungan (Value) awalnya menjadi 1
                frekuensiMap.put(elemen, 1);
            }
        }

        // 3. Menampilkan Hasil Output
        System.out.println("\nHasil Frekuensi Kemunculan:");
        
        // Iterasi melalui setiap pasangan Kunci-Nilai (Entry) dalam Map
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            // entry.getKey() adalah elemen angka (1, 2, 3, 4)
            // entry.getValue() adalah frekuensinya (1, 2, 3, 1)
            System.out.println("Angka " + entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
        System.out.println("----------------------------------------");
    }
}
