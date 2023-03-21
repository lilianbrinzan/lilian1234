import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wine");

        Wine h1 = new Wine(100, 15, "Caberne");
        Wine h2 = new Wine(120, 16, "Sovinion");
        Wine h3 = new Wine(130, 17, "Merlot");
        Wine h4 = new Wine(140, 18, "Saperavi");

        TreeSet wineList = new TreeSet<>();

        wineList.add(h1);
        wineList.add(h2);
        wineList.add(h3);
        wineList.add(h4);

        System.out.println(wineList);


    }
}