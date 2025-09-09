/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prakpbo2;

/**
 *
 * @author LENOVO
 */
public class Prakpbo2 {
    // Konstanta (jumlah semester maksimal)
    public static final int JUMLAH_SEMESTER = 2;

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama = "Titik Indah Pujiratnani"; // Nama lengkap mahasiswa
        String nim = "2407125891";               // NIM mahasiswa
        float ipSemester1 = 3.35f;               // IP semester 1
        float ipSemester2 = 3.50f;               // IP semester 2
        byte ipSemester1Byte = (byte) ipSemester1; // Konversi IP ke byte
        String alamat = "Jl. Anggrek";           // Alamat mahasiswa
        int umur = 20;                           // Umur
        char golonganDarah = 'B';                // Golongan darah

        // Hitung rata-rata IP
        float rataRataIP = (ipSemester1 + ipSemester2) / JUMLAH_SEMESTER;

        // Output ke layar
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
        System.out.println("Golongan Darah  : " + golonganDarah);
        System.out.println("IP Semester 1   : " + ipSemester1);
        System.out.println("IP Semester 2   : " + ipSemester2);
        System.out.println("IP Semester 1 (byte) : " + ipSemester1Byte);
        System.out.println("Jumlah Semester : " + JUMLAH_SEMESTER);
        System.out.println("Rata-rata IP    : " + rataRataIP);
    }
}