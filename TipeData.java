package com.mycompany.tipedata;

public class TipeData {

    public static void main(String[] args) 
    {
        /* membuat variabel berupa 
        1.Nama
        2.Nim
        3.IP tiap semester
        4.Umur
        5.Golongan Darah
        Konversi 1 IP ke tipe data byte
        Tambahkan komentar
        Wajib ada 1 Konstanta
        IP nya pakai array
        */
        
        String nama = "Zidan Nugraha Rey";
        final long NIM = 2407112382L;
        String alamat; //deklarasi variabel
        alamat = "Jl.Unggas"; //inisialisasi variabel
        double[] IP = {3.83, 3.82}; //ip semester 1 dan 2
        int count = 1; //untuk menampilkan semester 
        char blood = 'O';

        //menampilkan output
        System.out.println("Nama = "+ nama);
        System.out.println("NIM = "+ NIM);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Golongan Darah = "+ blood);
        System.out.println(" ");
        
        for(int i = 0; i < IP.length;i++)
        {
            System.out.println("IP Semester " + count + " = " + IP[i]);
            count++; //agar jumlah hitungan semesternya nambah
        }
    }
}
