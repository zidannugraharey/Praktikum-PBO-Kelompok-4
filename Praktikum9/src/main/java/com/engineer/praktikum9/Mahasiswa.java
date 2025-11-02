/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.engineer.praktikum9;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    private String nama;
    private String NIM;
    private String prodi;
    private String jenisKelamin;
    private boolean isActive;
    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public Mahasiswa(String nama, String nim, String prodi, String jenisKelamin, boolean isActive){
        this.nama = nama;
        this.NIM = nim;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.isActive = isActive;
    }
    
    public String getNama(){
        return this.nama;
    }
    public String getNim(){
        return this.NIM;
    }
    public String getProdi(){
        return this.prodi;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    public boolean isActive(){
        return isActive;
    }
}
