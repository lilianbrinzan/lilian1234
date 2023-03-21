import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wine");

        Wine h1 = new Wine(100, 5, "Caberne");
        Wine h2 = new Wine(110, 6, "Savinion");
        Wine h3 = new Wine(120, 7, "Merlot");
        Wine h4 = new Wine(130, 8, "Saperavi");
        Wine h5 = new Wine(140, 9, "Traminer");

        TreeSet wineList = new TreeSet<>();

        wineList.add(h1);
        wineList.add(h2);
        wineList.add(h3);
        wineList.add(h4);

        System.out.println(wineList);


    }
}