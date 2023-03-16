//package de.ait.object;
import java.util.Scanner;
// AIT Marsel Sidikov
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Human h1 = new Human( 29, true);
        Human h2 = new Human( 29, true);
        //Human h3 = null;
        //Scanner scanner = new Scanner(System.in);
        Programmer p1 = new Programmer(29, true, 11);
        Programmer p2 = new Programmer(29, true, 12);


        System.out.println(h1.equals(p1));
        System.out.println(p1.equals(h1));
        System.out.println(p1.equals(p2));
        System.out.println(h1.equals(h2));



        /**
         * System.out.println(h1.equals(scanner));
         *         System.out.println(h1.equals(h3));
         *         System.out.println(h1.equals(h2));
         *
         */

        /**
         * Human h = new Human( 29, true);
         *         Object obj = h;
         *         Scanner scanner = new Scanner(System.in);
         *         obj = scanner;
         */


    }
}