/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author alex
 */
public class dasarPengenalanJava {

    public static void main(String[] args) {
        
        /*1. Nama ✔️
         * 2. NIM ✔️
         * 3. IP Tiap semester ✔️ 
         * 4. Alamat ✔️
         * 5. Umur ✔️
         * 6. Golongan darah ✔️
         * 
         * Konversi 1 IP ke tipe data byte (✔️), Tambahkan komentar (✔️), Wajib ada 1 Konstanta
         * Tampilkan semua variable ke layar (System.out.println)
         */

        //Nama, NIM, IP, Alamat, Umur, Gol.Darah
        String nama = "Alya Kinanti"; //Nama
        final long NIM = 2407135010L; //NIM
        String alamat; //deklarasi variabel 
        alamat = "Jl.Lobak"; //inisialisasi variabel [ Alamat ]
        double[] IP = {3.63, 3.64}; //ip semester 1 dan 2
        int count = 1; //menampilkan semester 
        char blood = 'O'; //Golongan darah
        int umur = 20; //Umur

        //menampilkan output
        System.out.println("Nama = "+ nama);
        System.out.println("NIM = "+ NIM);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Umur = "+ umur);
        System.out.println("Golongan Darah = "+ blood);
        System.out.println(" ");
        
        for(int i = 0; i < IP.length;i++)
        {
            System.out.println("IP Semester " + count + " = " + IP[i]);
            count++; //agar jumlah hitungan semesternya nambah
        }
    }
}
