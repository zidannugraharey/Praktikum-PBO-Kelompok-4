/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.praktikum7;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ASUS
 */
public class Goblin extends Enemy {
    public Goblin(String nama, int hp, int baseDmg) {
        super(nama, hp, baseDmg);
    }

    @Override
    public int attack() {
        int chance = ThreadLocalRandom.current().nextInt(1, 101);
        int finalDmg;
        String nama = super.getNama(); // Menggunakan getter dari parent
        
        if (chance > 5) {
            finalDmg = super.getBaseDmg(); // Menggunakan getter
            System.out.println(nama + " menyerang sebesar " + finalDmg);
        } else {
            finalDmg = super.getBaseDmg() * 2;
            System.out.println("Critical Hit! " + nama + " menyerang sebesar " + finalDmg);
        }
        return finalDmg;
    }
}
