package praktikum5;

public class Mahasiswa {
    private String nama;
    private int nim;
    private double ipk;

    //Konstruktor Mahasiswa dengan parameter nama saja
    public Mahasiswa(String nama)
    {
        this.nama = nama;
    }
    //Konstruktor Mahasiswa dengan parameter nama dan nim
    public Mahasiswa(String nama, int nim)
    {
        this.nama = nama;
        this.nim = nim;
    }
    //Konstruktor Mahasiswa dengan parameter nama, nim, dan IPK
    public Mahasiswa(String nama, int nim, double ipk)
    {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    //Method dari Perkenalan Mahasiswa dengan parameter nama saja
    public void perkenalan(String nama)
    {
        System.out.println("Perkenalkan saya "+nama);
        System.out.println("Salam kenal !!");
    }
    //Method dari Perkenalan Mahasiswa dengan parameter nama dan nim
    public void perkenalan(String nama, int nim)
    {
        System.out.println("Perkenalkan saya "+nama);
        System.out.println("Nim saya "+nim);
        System.out.println("Salam kenal !!");
    }
    //Method dari Perkenalan Mahasiswa dengan parameter nama, nim, dan IPK
    public void perkenalan(String nama, int nim, double ipk)
    {
        System.out.println("Perkenalkan saya "+nama);
        System.out.println("Nim saya "+nim);
        System.out.println("IPK saya yaitu "+ipk);
        System.out.println("Salam kenal !!");
    }
}
