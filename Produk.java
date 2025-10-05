
package com.dicoding.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namaSupplier = "Rey";
    
    static int jumlahProduk = 0;
    
    public Produk (String nama, double harga, int stok)
    {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }
    public static void tampilkanJumlahProduk(){
        System.out.println("Jumlah produk adalah : "+ jumlahProduk);
    }
    public double getHarga(){
        return this.harga;
    }
    public void setHarga(double hargaBaru){
        if(hargaBaru > 0){
            this.harga = hargaBaru;
            System.out.println("harga baru adalah "+ this.harga);
        }
        else if(hargaBaru == 0){
            System.out.println("Barang Gratis");
        }
        else{
            System.out.println("Harga tidak bisa negatif");
        }
    }
    public void tampilkanInfo(){
        System.out.println("Nama : "+ nama);
        System.out.println("Harga : "+ harga);
        System.out.println("Stok : "+ stok);
    }
    public void tampilanNamaSupplier(){
        System.out.println("Nama supplier adalah: "+ namaSupplier);
    }
}
