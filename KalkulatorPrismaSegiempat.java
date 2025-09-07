import java.util.Scanner;
public class KalkulatorPrismaSegiempat {
    public static void main(String[] args){
        
        //Kalkulator Bangun Ruang Prisma Segi 4
        //Dalam kalkulator dapat menghitung Volume, Luas Permukaan, Total Panjang Rusuk

        //Deklarasi Variabel
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double sisi;
        double volume;
        double panjang;
        double lebar;
        double tinggi;

        //meminta input pengguna
        System.out.println("+-----KALKULATOR VOLUME PRISMA SEGIEMPAT-----+");
        System.out.println("Apa bentuk alas prisma nya ?");
        System.out.println("1.persegi");
        System.out.println("2.persegi panjang");
        System.out.print("pilih: ");
        pilihan = scanner.nextInt();

        //percabangan untuk mengetahui bentuk alas permukaan dari prisma segiempat
        if (pilihan == 1) 
        {
            System.out.println();
            System.out.println("+-----KALKULATOR VOLUME PRISMA SEGIEMPAT-----+");
            System.out.print("Masukkan nilai Sisi: ");
            sisi = scanner.nextDouble();
            System.out.print("Masukkan nilai tinggi: ");
            tinggi = scanner.nextDouble();
            volume = sisi * sisi * tinggi; //rumus volume prisma segiempat untuk alas persegi
            System.out.println("Hasil volume: "+ volume);
        }
        else if (pilihan == 2) 
        {
            System.out.println();
            System.out.println("+-----KALKULATOR VOLUME PRISMA SEGIEMPAT-----+");
            System.out.print("Masukkan nilai panjang: ");
            panjang = scanner.nextDouble();
            System.out.print("Masukkan nilai lebar: ");
            lebar = scanner.nextDouble();
            System.out.print("Masukkan nilai tinggi: ");
            tinggi = scanner.nextDouble();
            volume = panjang * lebar * tinggi; //rumus volume prisma segiempat untuk alas persegi panjang
            System.out.println("Hasil volume: "+ volume); 
        }

        scanner.close();
    }
}
