public class Main {
    public static void main(String[] args) {

        // Aufgabe 1

        Wine myWine1 = new Wine() ;
        myWine1.name = "Schardone";
        myWine1.sort = "gold";
        myWine1.year = 2018;

        Wine myWine2 = new Wine() ;
        myWine2.name = "Kaberne";
        myWine2.sort = "silver";
        myWine2.year = 2019;

        Wine myWine3 = new Wine() ;
        myWine3.name = "Merlo";
        myWine3.sort = "silver";
        myWine3.year = 2020;


        System.out.println();
        System.out.println(myWine1.toString());
        System.out.println(myWine2.toString());
        System.out.println(myWine3.toString());

        System.out.println(myWine1.onStock(10));
        System.out.println(myWine2.onStock(20));
        System.out.println(myWine3.onStock(25));


    }
}