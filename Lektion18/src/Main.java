public class Main {
    public static void main(String[] args) {

        // Prakticum
        //System.out.println("Hello world!");

        // арифметическая прогрессия A(n) = A1 + d*(n-1), d - разница прогресиe, A1 - первый член
        // Пусть A1 = 15, d = 7, сформировать массив из 10 первых чисел такой арифметической прогрессии
        // вывести на печать в строчку

        // Что будем вводить? - ничего, будем использовать данные из задачи в коде
        // Что на входе? - данные про прогрессию
        // Что нужно сделать? - объявить массив и занести в него данные
        // Ключевой алгоритм? - цикл, который заполняет массив

        System.out.println("Арифметическая прогрессия: ");

        int[] a = new int[10];
        for ( int i= 0; i < a.length; i++) {
            a[i] = 15 + 7*(i);
            // a[i] = 15 + 7*(i-1);
            System.out.print(a[i] + "/");
        }




        System.out.println();
        System.out.println();

        // заполнение случайными числами
        // бросаем кубик с 6-ю гранями 20 раз

        // Что будем вводить? - ничего, не надо
        // Что на входе? - есть датчик случайных чисел
        // Что нужно сделать? - обратиться к датчику случайных чисел 20 раз
        // с запросом целых случайных чисел от 1 до 6
        // Ключевой алгоритм? - цикл for и заполняем массив результатами бросков кубика

        System.out.println("Бросаем кубик 20 раз: ");


        int[] happines = new int[20];
        for (int i = 0; i< happines.length; i++ ) {
           happines[i] = (int)(( Math.random()*(6 -1+1) +1));
            System.out.print(happines[i] + "/");
        }

       // поиск элемента массива
        // создаем масси в целых случайных чисел
        //спрашиваем пользователя, есть ли элемент в массиве?
        // на выходе: "Да, он стоит на ... месте" или "Нет, такого элемента в массиве нет."

        System.out.println();
        System.out.println();


       //  Lektion 18 Hausaufgaben 1 New
        int[] myArray = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99} ;
        System.out.println("Part 1 !!!");
        for ( int i= 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        System.out.println("Part 2 !!!");
        for ( int i= myArray.length-1; i>=0; i--) {
            System.out.print(myArray[i]+" ");
        }
        System.out.print("Finisch !!! ");

        // System.out.println("Part 1 !!!");
        // for ( int i= 0; i < myArray.length; i++) {
        // myArray[i] = i+1;
        //if (i%2==0){
        // System.out.print(myArray[i]+" ");
        // }


    }
}