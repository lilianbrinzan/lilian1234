import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primer napolneniea TreeSet");

        TreeSet ts = new TreeSet();

        ts.add(" "); // prima data
        ts.add("a"); // prima data
        ts.add("B");
        ts.add("A"); // a doua data
        ts.add("C");
        ts.add("E");
        ts.add("D");
        ts.add("F");
        ts.add("J");
        ts.add("Ecaterina");
        ts.add("10");
        System.out.println("primer s strokami");

        System.out.println(ts);

        System.out.println("primer s cislami");

        TreeSet tsNum = new TreeSet(); // + un class
        tsNum.add(1);
        tsNum.add(5);
        tsNum.add(12);
        tsNum.add(3);
        tsNum.add(6);
        tsNum.add(10);
        tsNum.add(9);
        tsNum.add(5);


        System.out.println(tsNum);



    }
}