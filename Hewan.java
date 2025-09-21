package praktikum5;
abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    //method abstract
    abstract void suara();
    //method biasa
    void info() {
        System.out.println("Nama hewan: "+ nama);
    }
}
