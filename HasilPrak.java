package praktikum5;

public class HasilPrak {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");

        kalkulator calc = new kalkulator();
        System.out.println(calc.tambah(5,3));
        System.out.println(calc.tambah(5.5,3.2));
        System.out.println(calc.tambah("Hello","World!"));

    }
}

