class Snack {
    String merek;
    String tipeSnack;
    String expiredDate;
    int Harga;

    //Construct 1 (default)
    Snack() 
    {
        this.merek = "Oreo";
        this.tipeSnack = "Biscuit";
        this.expiredDate = "01-01-2026";
        this.Harga = 50000; 
    }

    //Construct 2 (hanya merek)
    Snack (String merek)
    {
        this.merek = merek;
        this.tipeSnack = "Biscuit";
        this.expiredDate = "01-01-2026";
        this.Harga = 45000;
    }

    //Construct 3 (semuanya)
    Snack (String merek, String tipeSnack, String expiredDate, int Harga)
    {
        this.merek = merek;
        this.tipeSnack = tipeSnack;
        this.expiredDate = expiredDate;
        this.Harga = Harga;
    }

    public void info()
    {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe snack : " + tipeSnack);
        System.out.println("Tanggal expirasi : " + expiredDate);
        System.out.println("Harga : " + Harga);
    }

}


