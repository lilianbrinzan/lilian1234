public class Main {

    public static void main(String[] args) {
        System.out.println("Arrays practicum");
        System.out.println();

        //Температура по дням недели
        int[] temperatures = new int[] {-1, 2, 0, 3, -5, 2, 1}; // зададим массив и заполним его значениями температуры
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (int i = 0; i < temperatures.length; i++){
            System.out.println(days[i] + " " + temperatures[i]);
        }
        double average_temp_sum = 0;
        for (int i = 0; i < temperatures.length; i++){
            average_temp_sum += temperatures[i];
        }

        double average_temp = average_temp_sum/temperatures.length;
        System.out.println("Average temperature of week is: " + average_temp);

        System.out.println();

        // арифметическая прогрессия A(n) = A1 + d*(n-1), d - разница прогресиb, A1 - первый член
        // Пусть A1 = 15, d = 7, сформировать массив из 10 первых чисел такой арифметической прогрессии
        // вывести на печать в строчку

        System.out.println("Арифметическая прогрессия: ");

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 15 + 7 * i;
            System.out.print(a[i] + " | ");
        }
        System.out.println();
        System.out.println();

        // заполнение случайными числами
        // бросаем кубик с 6-ю гранями 20 раз

        System.out.println("Бросаем кубик 20 раз: ");

        int[] score = new int[20];
        for (int i = 0; i < score.length; i++) {
            score[i] = (int)(( Math.random() * (6 - 1 + 1) + 1));
            System.out.print( score[i] + " | ");
        }
    }
}