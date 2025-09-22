package praktikum5;
public class kalkulator {
    // //constructor dengan 2 parameter
    // public int tambah (int a, int b){
    //     return a+b;
    // }
    // //constructor dengan 3 parameter
    // public int tambah (int a, int b, int c){
    //     return a+b+c;
    // }
    // //constructor dengan 4 parameter
    // public int tambah (int a, int b, int c, int d){
    //     return a+b+c+d;
    // }

    //method untuk int
    public int tambah(int a, int b)
    {
        System.out.println("Menambah integer");
        return a + b;
    }
    //method untuk double
    public double tambah(double a, double b)
    {
        System.out.println("Menambah double");
        return a+b;
    }
    //method untuk String (concantenation)
    public String tambah(String a, String b)
    {
        System.out.println("Menambah String");
        return a + b;
    }
}
