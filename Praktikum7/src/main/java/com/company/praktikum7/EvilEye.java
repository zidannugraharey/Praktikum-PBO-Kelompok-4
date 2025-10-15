/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.praktikum7;

/**
 *
 * @author ASUS
 */
public class EvilEye extends Enemy {
    private int stack;
    private int dmgAbsorb;
    
    public EvilEye (String nama, int hp, int hpTotal, int baseDmg){
        super(nama, hp, hpTotal, baseDmg);
    }
    
    @Override
    public int attack(){
        String nama = super.getNama();
        int finalDmg = 0;
        int absorbDmg = 0;
        absorbDmg = super.getHpTotal() - super.getHp();
        this.dmgAbsorb += absorbDmg;
        System.out.println("Total damage diterima yang di simpan : "+absorbDmg);
        if(this.stack == 5){
            finalDmg = absorbDmg * 2/10;
            System.out.println(nama + " menghabiskan 5 stack, menyerang sebesar " + finalDmg);
            this.stack = 0;
        }
        else{
            System.out.println("Stack saat ini: " +this.stack);
            finalDmg = super.getBaseDmg(); // Menggunakan getter
            System.out.println(nama + " menyerang sebesar " + finalDmg);
            this.stack++;
        }
        
        return finalDmg;
    }

}
