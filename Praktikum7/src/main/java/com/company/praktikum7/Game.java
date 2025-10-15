/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.praktikum7;

/**
 *
 * @author ASUS
 */
public class Game {
    public static void main(String[] args) {
        // Buat objek dari kelas Player dan Goblin
        Player hero = new Player("Sung jin woo", 300, 12);
        EvilEye monster = new EvilEye("Evil Eye", 150, 150, 7);

        System.out.println("BATTLE START");
        hero.tampilkanStat();
        monster.tampilkanStat();
        System.out.println("\n========================================\n");
        
        // Game berjalan selama HP hero DAN HP monster di atas 0
        int ronde = 1;
        while (hero.getHp() > 0 && monster.getHp() > 0) {
            System.out.println("--- Ronde " + ronde + " ---");

            // Giliran Hero menyerang Monster
            int heroDamage = hero.attack();      // Hero melakukan serangan
            monster.terimaSerangan(heroDamage);  // Monster menerima serangan

            // Cek apakah monster sudah kalah setelah diserang
            if (monster.getHp() <= 0) {
                break; // Hentikan loop jika monster kalah
            }
            
            System.out.println();

            // Giliran Monster menyerang Hero
            int monsterDamage = monster.attack(); // Monster menyerang (bisa critical)
            hero.terimaSerangan(monsterDamage);  // Hero menerima serangan

            // Tampilkan status terbaru setelah ronde selesai
            System.out.println();
            hero.tampilkanStat();
            monster.tampilkanStat();
            System.out.println("\n========================================\n");
            
            ronde++;
        }

        //Menentukan Pemenang
        System.out.println("--- Pertarungan Selesai ---");
        if (hero.getHp() > 0) {
            System.out.println("Selamat! " + hero.getNama() + " memenangkan pertarungan!");
        } else {
            System.out.println("Sayang sekali, " + hero.getNama() + " telah dikalahkan.");
        }
    }
}
