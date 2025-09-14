
import java.util.Scanner;


public class praktikum4Kalkulator {
    public static void main(String[] args) {
        /*Membuat kalkulator (aplikasi sederhana) luas
        bangun datar, dengan input dari pengguna, dan
        dengan pilihan menu (bisa kembali ke menu
        utama). Bangun datar yang digunakan : Persegi,
        Persegi Panjang, Lingkaran, Segitiga. */
        Scanner input = new Scanner(System.in);
        final double PHI = 3.14;
        double luas;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println();
            System.out.println("+++=====KALKULATOR BANGUN DATAR=====+++");
            System.out.println("+++ Menu :                          +++");
            System.out.println("+++ 1.Luas Persegi                  +++");
            System.out.println("+++ 2.Luas Persegi Panjang          +++");
            System.out.println("+++ 3.Luas Lingkaran                +++");
            System.out.println("+++ 4.Luas Segitiga                 +++");
            System.out.println("+++ 5.Keluar                        +++");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai sisi: ");
                    double sisi = input.nextDouble();
                    luas = sisi * sisi;
                    System.out.println("Luas persegi: " + luas);
                    break;
                case 2:
                    System.out.print("Masukkan nilai panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan nilai lebar: ");
                    double lebar = input.nextDouble();
                    luas = panjang * lebar;
                    System.out.println("Luas persegi panjang: "+ luas);
                    break;
                case 3:
                    System.out.print("Masukkan nilai jari jari: ");
                    double radius = input.nextDouble();
                    luas = PHI * radius * radius;
                    System.out.println("Luas lingkaran: "+ luas);
                    break;
                case 4:
                    System.out.print("Masukkan nilai alas segitiga: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan nilai tinggi: ");
                    double tinggi = input.nextDouble();
                    luas = (alas * tinggi) / 2;
                    System.out.println("Luas segitiga: "+ luas);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    break;
            }

        }
        input.close();

    }
}
