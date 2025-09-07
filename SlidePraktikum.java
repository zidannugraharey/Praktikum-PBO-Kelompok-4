
package com.dicoding.slidepraktikum;
import java.util.Scanner;

public class SlidePraktikum {

    public static void main(String[] args) {
        //Operator
        
        //Operator Aritmatika
        int x = 20, y = 10;
        
        System.out.println("x + y = " +(x + y)); //Penjumlahan -- Output = 30
        System.out.println("x - y = " +(x - y)); //Pengurangan -- Output = 10
        System.out.println("x * y = " +(x * y)); //Pengurangan -- Output = 200
        System.out.println("x / y = " +(x / y)); //Pembagian -- Output = 2
        System.out.println("x % y = " +(x % y)); //Modulus -- Output = 0
        
        //Increment atau Decrement (Pertambahan atau Penguranan sebuah variabel sebanyak 1 
        System.out.println("++x = "+ (x++)); //Output = 21
        System.out.println("y-- = "+ (--y)); //Output = 9
        
        //Operator Perbandingan
        System.out.println("x == y : "+ (x == y)); //false
        System.out.println("x != y : "+ (x != y)); //true
        System.out.println("x > y  : "+ (x > y)); //true
        System.out.println("x < y  : "+ (x < y)); //false
        System.out.println("x >= y : "+ (x >= y)); //true
        System.out.println("x <= y : "+ (x <= y)); //false
        
        //Operator Logika
        boolean p = true, q = false;
        
        System.out.println("p && q : "+ (p && q)); // AND : false
        System.out.println("p || q : "+ (p || q)); // OR : true
        System.out.println("!p     : "+ (!p)); // NOT : false
        
        //Short-circuit Evaluation
        int a = 5, b = 0;
        boolean result =  (b != 0) && (a / b > 2); //Tidak error karena short-circuit
        System.out.println("Result : "+ result); //false karena false && false = false
        
        //Operator Assignment
        int num = 10;
        
        num += 5; // num = num + 5 = 15;
        num -= 3; // num = num - 3 = 12;
        num *= 2; // num = num * 2 = 20;
        num /= 4; // num = num / 4 = 6;
        num %= 4; // num = num % 4 = 2;
        
        System.out.println("Hasil akhir = "+ num);
        
        //Operator Tennary
        int score = 85;
        String grade = (score >= 80) ? "A" : (score >= 70) ? "B" : "C";
        System.out.println("Nilai = " + grade);
        
        //Penggunaan untuk mencari nilai maksimum
        int max = (10 > 5) ? 10 : 5;
        System.out.println("Maximum : " + max);
        
        //Operator BitWise
        int r = 12, s = 10; // 12 == 1100 dalam biner dan 10 == 1010 dalam biner
        
        System.out.println("r & s = "+ (r & s)); // AND : 8 (1000)
        System.out.println("r | s = "+ (r | s)); // OR : 14 (1110)
        System.out.println("r ^ s = "+ (r ^ s)); // XOR : 6 (0110)
        System.out.println("~r = "+ (~r)); // AND : 8 (1000)
        System.out.println("r << s = "+ (r << s)); // AND : 8 (1000)
        System.out.println("r >> s = "+ (r >> s)); // AND : 8 (1000)
        
        //Input / Output
        System.out.println("Hello World!"); //Menggunakan System.out untuk menampilkan Output
        System.out.println("Baris Kedua");
        
        System.out.print("Hello "); //print tanpa "ln" berarti tidak di tampilkan di baris baru
        System.out.print("World!"); 
        System.out.println(); //print line = tampilkan di baris baru
        
        String nama = "John";
        int umur = 25;
        double tinggi = 175.5;
        
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm%n", nama, umur, tinggi);
        
        //Input menggunakan Scanner
        Scanner scanner = new Scanner(System.in);
        
        //input String
        System.out.print("Masukan nama: ");
        nama = scanner.nextLine();
        //Input integer
        System.out.println("Masukan umur: ");
        umur = scanner.nextInt();
        //Input Double
        System.out.println("Masukan Tinggi: ");
        tinggi = scanner.nextDouble();
        
        //Class Wrapper
        
        //Auto Boxing dan Unboxing
        //Auto boxing - Primitif ke wrapper
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoboxing
        
        //Unboxing - wrapper ke primitif
        Integer anotherWrapper = 200;
        int anotherPrimitif =  anotherWrapper; //Unboxing
        
        //String ke wrapper/primitif
        String strNumber = "123";
        String strDouble = "45.67";
        String strBoolean = "true";
        
        //Parse methods
        int num1 = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        boolean flag = Boolean.parseBoolean(strBoolean);
        
        System.out.println("Parsed int: "+ num1);
        System.out.println("Parsed double: "+ decimal);
        System.out.println("Parsed boolean: "+ flag);
        
        Integer wrapperNum = Integer.valueOf(strNumber);
        Double wrapperDecimal = Double.valueOf(strDouble);
        
        System.out.println("Wrapper Integer: "+ wrapperNum);
        System.out.println("Wrapper Decimal: "+ wrapperDecimal);    
        
        //Wrapper/primitif ke String
        int value =789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);
        System.out.println("toString(): "+ strValue1);
        System.out.println("valueOf(): "+ strValue2);
        
        //Integer methods
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);
        
        //Konversi Sistem Bilangan
        int desimal = 255;
        System.out.println("Binary: "+ Integer.toBinaryString(desimal)); //basis 2
        System.out.println("Oktal: "+ Integer.toOctalString(desimal)); //basis 8
        System.out.println("Hex: "+ Integer.toHexString(desimal)); //basis 16
        
        //ENUMERASI
        
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        Hari hariIni = Hari.SENIN;
        if(hariIni == Hari.SENIN)
        {
            System.out.println("Hari ini adalah "+ Hari.SENIN);
            System.out.println("Besok adalah " + Hari.SELASA);
        }
    }
}
