public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Wine myWine1 = new Wine();
        myWine1.name = "lealeaVino";
        myWine1.sort = "caberne";
        myWine1.year = 1994;

        Wine myWine2 = new Wine();
        myWine2.name = "bbbbVino";
        myWine2.sort = "merlot";
        myWine2.year = 2004;

        Wine myWine3 = new Wine();
        myWine3.name = "lealeaVino";
        myWine3.sort = "caberne";
        myWine3.year = 2000;

        System.out.println();
        System.out.println(myWine1.toString());
        System.out.println(myWine2.toString());
        System.out.println(myWine3.toString());

        System.out.println(myWine1.onStock(10));
        System.out.println(myWine2.onStock(20));
        System.out.println(myWine3.onStock(25));




    }
}