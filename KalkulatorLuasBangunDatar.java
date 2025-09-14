import java.util.Scanner;

public class KalkulatorLuasBangunDatar {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do 
        {
            //Menu kalkulator luas bangun datar
            System.out.println("\n=== Kalkulator Luas Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");   
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda (1-5): ");
            pilihan = input.nextInt();
            System.out.println("");

            //Switch untuk memilih bangun datar
            switch (pilihan) 
            {
                case 1 -> 
                {
                    //menghitung Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = input.nextDouble();
                    double luasPersegi = sisi * sisi;
                    System.out.println("Luas persegi adalah: " + luasPersegi);
                }

                case 2 ->
                {
                    //menghitung Persegi panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = input.nextDouble();
                    double luasPersegiPanjang = panjang * lebar;
                    System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);
                }

                case 3 -> 
                {
                    //menghitung lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jari = input.nextDouble();
                    final double phi = 3.14;
                    double luasLingkaran = phi * jari * jari;
                    System.out.println("Luas lingkaran adalah: " + luasLingkaran);
                }
                
                case 4 -> 
                {
                    //menghitung segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = input.nextDouble();
                    double luasSegitiga = 0.5 * alas * tinggi;
                    System.out.println("Luas segitiga adalah: " + luasSegitiga);
                }

                case 5 -> System.out.println("Terima kasih, program selesai."); //program langsung selesai

                default -> System.out.println("Pilihan tidak valid, coba lagi!"); //error jika tidak memilih 1 - 5
            }
        } 
        
        while (pilihan != 5); //program berlanjut sampai user pilih 5
        
        input.close();
    }
}
