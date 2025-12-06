/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl02;

/**
 *
 * @author LOQ
 */
 import java.util.Scanner;
public class SoalUKL02 {

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
         
                for (int i = 50; i >= 1; i--) {
            System.out.print(i + ". ");
 
            if (i == 50) {
                System.out.println("saya senang");
                continue;
            }

            if (i % 3 == 2) {
                System.out.println("saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println("saya anak wikusama");
            } else { 
                System.out.println("saya angkatan 33");
            }
        }
        
        input.close();
    }
}
    

