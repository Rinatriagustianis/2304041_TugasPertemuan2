/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.tugaspertemuan2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Tugaspertemuan2 {

    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        
        // Soal Nomor 1 Ganjil
        System.out.println("Masukan tiga angka bilangan bulat : ");
        
        int angka1 = objekInput.nextInt();
        int angka2 = objekInput.nextInt();
        int angka3 = objekInput.nextInt();
        
        System.out.println("Hasil output penjumlahan : " + (angka1+angka2+angka3));
        System.out.println("Hasil output pengurangan : " + (angka1-angka2-angka3));
        System.out.println("Hasil output perkalian : " + (angka1*angka2*angka3));
        System.out.println("Hasil output pembagian : " + (angka1/angka2/angka3)); 
        
        
        // Soal Nomor 2 Ganjil
        System.out.print("Jumlah uang saya saat ini : ");
        int uang = objekInput.nextInt();
        
        System.out.print("Hari ini hujan atau tidak : "); // True atau False
        boolean hujan = objekInput.nextBoolean();
        
        System.out.println("Kalau begitu Saya akan keluar untuk membeli gorengan : " + (uang > 5000 && !hujan));
        
        
        // Soal Nomor 3 Ganjil
        System.out.println("Masukan dua karakter ASCII yang ingin dijumlahkan : ");
        char karakter1 = objekInput.next().charAt(0);
        char karakter2 = objekInput.next().charAt(0);

        // Mendapatkan nilai ASCII dari karakter
        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;
        
        int jml = ascii1 + ascii2;
        
        System.out.println("Kode ASCII dari "+ karakter1 +" : " + ascii1);
        System.out.println("Kode ASCII dari "+ karakter2 +" : " + ascii2);
        System.out.println("Jumlah kode ASCII dari "+ karakter1 +" dan "+ karakter2 +" : " + jml);

        objekInput.close();
    }
}
