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
        StringConcate stringConcate = (a,b) -> Integer.toString(a) + b;
        System.out.println("concate strings");
        System.out.println( stringConcate.concat(10, 24) );

        //  2. есть строка, если ее длина равна 3 вернуть true  иначе  false
        Checkable checkable = s -> s.length() == 3;
        System.out.println("check if length 3");
        System.out.println(checkable.check("abs"));
        System.out.println(checkable.check("abcd"));

        //  3. eсть строка string распечатать ее в виде !s!
        Printable printable = s -> System.out.println( "!" + s + "!");
        System.out.println( "printig !s!");
        printable.print("abc");


        //написать лямбда выражение такое, что если длина строки = 4,
        // то вернуть четыре звездочки иначе вернуть
        // строку без изменений
        Transformable transformable = s -> s.length() == 4 ? s = "****" : s;
        System.out.println( "Transformable");
        System.out.println( transformable.modify("ab"));
        System.out.println( transformable.modify("abcd"));

        // написать лямбда выражение такое, что будет печататься
        // "Hello World"
        Producable producable = () -> "Hello World";
        System.out.println("Producable");
        System.out.println(producable.produce());

    }

}