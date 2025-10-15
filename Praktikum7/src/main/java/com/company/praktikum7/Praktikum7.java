/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.praktikum7;

/**
 *
 * @author ASUS
 */
public class Praktikum7 {

    public static void main(String[] args) {
        BarangElektronik laptop = new BarangElektronik("Laptop", 900000, 12);
        laptop.tampilkanInfo();
        laptop.tampilkanGaransi();

        Produk p1 = new Produk ("Buku", 15000);
        BarangElektronik p2 = new BarangElektronik ("Mouse", 150000, 6);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk Umum : "+p1.hitungPajak());
        System.out.println("Harga Akhir Produk: "+p1.hitungHarga());
        System.out.println("----------------------------------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Barang Elektronik   : "+p2.hitungPajak());
        System.out.println("Harga Akhir Produk: "+p2.hitungHarga());

            
          
    }
}
