/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.praktikum7;

/**
 *
 * @author ASUS
 */
public class Enemy {
    private String nama;
    private int hp;
    private int baseDmg;
    private int hpTotal;

    public Enemy(String nama, int hp,int hpTotal, int baseDmg) {
        this.nama = nama;
        this.hp = hp;
        this.hpTotal = hpTotal;
        this.baseDmg = baseDmg;
    }

    // --- GETTERS ---
    public String getNama() {
        return this.nama;
    }

    public int getHp() {
        return this.hp;
    }
    public int getHpTotal() {
        return this.hpTotal;
    }

    public int getBaseDmg() {
        return this.baseDmg;
    }

    // --- SETTERS ---
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void terimaSerangan(int dmg) {
        this.hp -= dmg; // Mengurangi HP internal Enemy
        System.out.println(this.nama + " terkena serangan sebesar " + dmg + " damage");
        if (this.hp < 0) {
            this.hp = 0;
        }
        
    }
    

    // Method attack
    public int attack() {
        return this.baseDmg;
    }
    
    // Method tampilkan status
    public void tampilkanStat() {
        System.out.println("---------------------------");
        System.out.println("Nama    : " + this.nama);
        System.out.println("HP      : " + this.hp);
    }
}
