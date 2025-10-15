// ...existing code...
package praktikum7;
import java.util.concurrent.ThreadLocalRandom;

public class Goblin extends Enemy {
    public Goblin(String nama, int hp, int baseDmg) {
        super(nama, hp, baseDmg);
    }

    @Override
    public int attack() {
        int chance = ThreadLocalRandom.current().nextInt(1, 101);
        int finalDmg;
        String nama = super.getNama();
        
        if (chance > 5) {
            finalDmg = super.getBaseDmg();
            System.out.println(nama + " menyerang sebesar " + finalDmg);
        } else {
            finalDmg = super.getBaseDmg() * 2;
            System.out.println("Critical Hit! " + nama + " menyerang sebesar " + finalDmg);
        }
        return finalDmg;
    }
}