import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример наполнения TreeSet");

        TreeSet ts = new TreeSet();
        // Добавляем элементы к набору
        ts.add(" "); // добавили "пробел"
        ts.add("a"); // первый раз А добавили
        ts.add("a a a"); // первый раз А добавили
        ts.add("B");
        ts.add("A"); // второй раз А добавили, но Set не дает
        ts.add("C");
        ts.add("E");
        ts.add("D");
        ts.add("F");
        ts.add("J");
        ts.add("Ecaterina");
        ts.add("10");
        System.out.println("Пример со строками");
        // Выводим на печать
        System.out.println(ts);

        System.out.println("Пример с целыми числами");

        TreeSet tsNum = new TreeSet(); // здаем ещё один элемент класса
        // Добавляем элементы к набору древа
        tsNum.add(1);
        tsNum.add(5);
        tsNum.add(12);
        tsNum.add(3);
        tsNum.add(6);
        tsNum.add(10);
        tsNum.add(9);
        tsNum.add(5);

        /**
         * tsNum.add("1");
         *         tsNum.add("5");
         *         tsNum.add("12");
         *         tsNum.add("3");
         *         tsNum.add("6");
         *         tsNum.add("10");
         *         tsNum.add("9");
         *         tsNum.add("A");
         *         tsNum.add("April");
         *         tsNum.add("March");
         *         tsNum.add("10");
         *         tsNum.add("1,2");
         *         tsNum.add("120");
         *         tsNum.add("February");
         *         tsNum.add("120");
         *         tsNum.add("C");
         */


        System.out.println(tsNum);



    }
}