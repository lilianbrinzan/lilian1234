import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        System.out.println("Fruits :  Apple und Orange ");

        Fruit fruct1 = new Fruit("Astrahan", 1, 12);
        Fruit fruct2 = new Fruit("Red Melba", 2, 23);
        Fruit fruct3 = new Fruit("London Pippin", 3, 34);
        Fruit fruct4 = new Fruit("Renete", 4, 45);

        Fruit fruct5 = new Fruit("Ana", -1, 54);
        Fruit fruct6 = new Fruit("Camelia", -2, 65);
        Fruit fruct7 = new Fruit("Diana", -3, 76);
        Fruit fruct8 = new Fruit("Ema", -4, 87);

        // объявляем TreeSet
        TreeSet fructList = new TreeSet<>();

        // Заполняем TreeSet
        fructList.add(fruct1);
        fructList.add(fruct2);
        fructList.add(fruct3);
        fructList.add(fruct4);
        fructList.add(fruct5);
        fructList.add(fruct6);
        fructList.add(fruct7);
        fructList.add(fruct8);


        System.out.println(fructList);

    }
}