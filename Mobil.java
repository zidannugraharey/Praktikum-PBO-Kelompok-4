package praktikum5;
public class Mobil {
    //Atribut
    private String merk;
    private String warna;
    private int tahun;
    private double harga;

    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin dinyalakan");
    }
    public void matikanMesin(){
        System.out.println("Mesin dimatikan");
    }

    //Default Constructor
    public Mobil(){
        this.merk = "Unknown";
        this.warna = "Unknown";
        this.tahun = 1;
    }
    
    // Constructor dengan parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    
    public Mobil(String merk)
    {
        this.merk = merk;
        this.warna = "putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }
}
