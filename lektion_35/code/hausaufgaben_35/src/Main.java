public class Main {
    public static void main(String[] args) {

        // Aufgabe 1

        Wine myWine = new Wine() ;
        myWine.name = "Schardone";
        myWine.sort = "silver";
        myWine.year = 2018;


        System.out.println();
        System.out.println(myWine.toString());

    }
}