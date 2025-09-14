import java.util.Scanner;
public class hasilPrak4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //If else
        System.out.println("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        if (nilai > 75) {
            System.out.println("Anda lulus ujian");
        }
        else
        {
            System.out.println("Anda harus mengulang");
        }

        //If else if else
        if (nilai > 75)
        {
            System.out.println("Anda lulus");
        }
        else if (nilai > 65 && nilai < 75 )
        {
            System.out.println("Anda berada di ambang kelulusan");
        }
        else
        {
            System.out.println("Anda gagal");
        }

        //Switch Case
        System.out.println("Masukkan Warna (RGB): ");
        String warna = scanner.nextLine();
        switch (warna) {
            case "R":
                System.out.println("Anda memilih merah");
                break;
            case "G":
                System.out.println("Anda memilih hijau");
                break;
            case "B":
                System.out.println("Anda memilih biru");
                break;
            default:
                System.out.println("Warna tidak tersedia");
                break;
        }

        //nested if
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();
        if (angka >= 0) {
            System.out.println("Bilangan bernilai positif");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            }
            else
            {
                System.out.println("dan ganjil");
            }
        }
        else if (angka == 0)
        {
            System.out.println("bilangan netral");
        }
        else
        {
            System.out.println("Bilangan bernilai negatif");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            }
            else
            {
                System.out.println("dan ganjil");
            }
        }
        
        
        
        //FOR
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("perulangan ke-"+i);
        }

        String[] mahasiswa = {"Andi", "Budi", "Citra", "Dewi", "Eko"};

        for(int i = 0; i < mahasiswa.length; i++)
        {
            System.out.println("Mahasiswa ke-"+(i+1) +": "+ mahasiswa[i]);
        }
        
        int a = 1;

        //While
        while (a <= 5) {
            System.out.println("while loop ke-"+a);
            a++;
        }
        
        String password = " ";
        while (!password.equals("java123")) 
        {
            System.out.println("Masukkan password: ");
            password = scanner.nextLine();
        }
        System.out.println("Login berhasil");


        //Do While
        int x = 6;
        do {
            System.out.println("Do While loop ke-" + x);
            x++;
        } while (x <= 5);

        //Nested Loop
        System.out.println("---Mencetak Nomor Kursi Bioskop---");
        char kursi = 'A';
        for(int i = 0; i < 3; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.println(kursi + "" +j+"");
            }
            System.out.println();
            kursi++;
        }


        //Control Statement
        //break
        for (int d = 1; d<=10; d++)
        {
            if(d == 5)
            {
                System.out.println("Break di angka "+ d);
                break;
            }
            System.out.println("Angka: "+d);
        }

        //continue
        for(int e = 1; e <= 10; e++)
        {
            if(e % 2 == 0)
            {
                continue;
            }
            System.out.println("Bilangan ganjil: "+e);
        }
        scanner.close();
    }
}
