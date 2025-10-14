/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.praktikum7;

/**
 *
 * @author ASUS
 */
public class Player {
    // 1. Atribut sudah private (Bagus!)
    private String nama;
    private int hp;
    private int baseDmg;

    public Player(String nama, int hp, int baseDmg) {
        this.nama = nama;
        this.hp = hp;
        this.baseDmg = baseDmg;
    }

    // --- GETTERS (Untuk membaca data) ---
    public String getNama() {
        return this.nama;
    }

    public int getHp() {
        return this.hp;
    }

    public int getBaseDmg() {
        return this.baseDmg;
    }

    // --- SETTERS (Untuk mengubah data) ---
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void terimaSerangan(int dmg) {
        this.hp -= dmg; // HP internal player berkurang
        System.out.println(this.nama + " terkena serangan sebesar " + dmg + " damage");
        if (this.hp < 0) {
            this.hp = 0; // Agar HP tidak minus
        }
    }
    
    // Method ini sudah oke
    public int attack() {
        System.out.println(this.nama + " menyerang sebesar " + this.baseDmg);
        return this.baseDmg;
    }
    
    // Method ini sudah oke
    public void tampilkanStat() {
        System.out.println("---------------------------");
        System.out.println("Nama  : " + this.nama);
        System.out.println("HP    : " + this.hp + "/100"); // Asumsi max HP 100
    }
}
