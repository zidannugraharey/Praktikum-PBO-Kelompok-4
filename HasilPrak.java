package praktikum5;

public class HasilPrak {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");

        kalkulator calc = new kalkulator();
        System.out.println(calc.tambah(5,3));
        System.out.println(calc.tambah(5.5,3.2));
        System.out.println(calc.tambah("Hello","World!"));
        System.out.println();
        
        //Deklarasi Instansi dari Class Mahasiswa
        Mahasiswa mahasigma1 = new Mahasiswa("Ujang");
        Mahasiswa mahasigma2 = new Mahasiswa("Bakwan", 1234);
        Mahasiswa mahasigma3 = new Mahasiswa("Ace", 20391, 4.0);

        //Pemanggilan method overload
        mahasigma1.perkenalan("Ujang");
        mahasigma2.perkenalan("Bakwan", 1234);
        mahasigma3.perkenalan("Bakwan", 20391, 4.0);
    }
}

