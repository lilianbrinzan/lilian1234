public class Main {
    public static void main(String[] args) {
        System.out.println("Hausaufgaben 58");

        /**
         *Написать следующие лямбды используя наши интерфейсы
         *
         *     1. сложить строки a и  b
         *
         *     2. есть строка, если ее длина равна 3 вернуть true  иначе  false
         *
         *     3. eсть строка string распечатать ее в виде !string!
         *
         */

        //  1. сложить строки a и  b
        StringConcate stringConcate = (a,b) -> a.concat(b);
        System.out.println( stringConcate.concat("Chec", "kable") );


        //  2. есть строка, если ее длина равна 3 вернуть true  иначе  false
        Checkable checkable = (a) -> ((a.length() == 3) ? true : false);
        System.out.println(checkable.check("Hallo"));
        System.out.println(checkable.check("abc"));


        //  3. eсть строка string распечатать ее в виде !string!
        Printable printable = (a) -> "!" + a + "!";
        System.out.println(printable.print("string"));


    }
}