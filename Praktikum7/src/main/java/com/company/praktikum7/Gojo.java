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
public class Gojo extends Enemy {
    public Gojo (String nama, int hp,int hpTotal, int baseDmg) {
        super(nama, hp, hpTotal, baseDmg);
    }

    @Override
    public int attack() {
        int chance = ThreadLocalRandom.current().nextInt(1, 101);
        int finalDmg;
        String nama = super.getNama(); // Menggunakan getter dari parent
        
        if (chance < 20) {
            finalDmg = 0; 
            System.out.println(nama +" Memakai skill");
            
            
        } else {
            finalDmg = super.getBaseDmg();
            System.out.println(nama + " menyerang sebesar " + finalDmg);
        }
        return finalDmg;
    }
}
