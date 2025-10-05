

package com.dicoding.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Mavenproject1 {

    public static void main(String[] args) {
//        Produk p1 = new Produk("Laptop", 1200000, 5);
//        Produk p2 = new Produk("Handphone", 5000000, 2);
//        
//        p1.tampilkanInfo();
//        p1.tampilanNamaSupplier();
//        p1.setHarga(0);
////        System.out.println("Jumlah produk : "+Produk.jumlahProduk);
//        Produk.tampilkanJumlahProduk();
        
        Fakultas f1 = new Fakultas("Teknik", 07);
        Fakultas.tampilkanJumlahFakultas();
        
        Jurusan j1 = new Jurusan("Elektro", 120);
        Jurusan j2 = new Jurusan("Sipil", 222);
        Jurusan.tampilkanJumlahJurusan();
        
        j1.setMahasiswa(119); //Setter
        System.out.println("Mahasiswa Elektro saat ini : "+ j1.getMahasiswa());
        
        
    }
}
