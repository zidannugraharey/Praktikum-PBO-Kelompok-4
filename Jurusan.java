
package com.dicoding.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Jurusan {
    public String nama;
    private int jumlahMahasiswa;
    static int jumlahJurusan;
    
    public static void tampilkanJumlahJurusan(){
        System.out.println("Jumlah jurusan saat ini : "+jumlahJurusan);
    }
    public Jurusan (String nama, int jumlahMahasiswa){
        this.nama = nama;
        this.jumlahMahasiswa = jumlahMahasiswa;
    }
    public int getMahasiswa(){
        return this.jumlahMahasiswa;
    }
    public void setMahasiswa(int jumlahMahasiswaBaru){
        if(jumlahMahasiswaBaru > 0){
            this.jumlahMahasiswa = jumlahMahasiswaBaru;
            System.out.println("Jumlah Mahasiswa terbaru adalah "+ this.jumlahMahasiswa);
        }
        else if(jumlahMahasiswaBaru == 0){
            System.out.println("Yahh dah pada tamat gada mahasiswa lagi");
        }
        else{
            System.out.println("Jumlah Mahasiswa tidak bisa negatif");
        }
    }
}
