public class SnackTesting {
    public static void main(String[] args) 
    {
        //Constructor method
        Snack Snack1 = new Snack(); 
        Snack Snack2 = new Snack("Sari gandum");
        Snack Snack3 = new Snack("Nabati", "Wafer", "05-05-2026", 30000);

        System.out.println("=========================");
        Snack1.info();
        System.out.println("=========================");
        Snack2.info();
        System.out.println("=========================");
        Snack3.info();
        System.out.println("=========================");


    }    
}

