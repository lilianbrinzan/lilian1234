import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Нахождение НОД для двух целых чисел a и b");
        // Задача: найти наибольший общий делитель (НОД) двух целых чисел a и b.
        //Примеры:
        //15 и 20: НОД = 5
        //15 и 60: НОД = 15
        //17 и 23: НОД = 1
        //24 и 40: НОД = 8
        //6 и 18: НОД = 6
        // 4 и 12: НОД = 4

        //Алгоритм:
        //Шаг 1: сравнить числа a и b, найти меньшее из них, пусть меньшее будет min, а большее max.
        //Шаг 2: пройти в цикле от 1 до min (включительно) и делить min на параметр цикла.
        //Если min разделилось нацело на параметр цикла, то делим второе число max на это же число.
        //Если max разделилось нацело на параметр цикла, то НОД = параметр цикла.

        Scanner sc = new Scanner(System.in);

        int nod = 0;

        System.out.println("Введите 1-е число: ");
        int a = sc.nextInt();
        System.out.println("Введите 2-е число: ");
        int b = sc.nextInt();
        System.out.println("Вы ввели числа " + a + " и " + b);

        int min = min (a, b);
        int max = max (a,b);

        System.out.println("Меньшее число " + min);
        System.out.println("Большее число " + max);

        for (int i = 1; i <= min; i++) {
            if (min % i == 0) {
                if (max % i == 0) {
                    nod = i;
                }
            }
        }

        System.out.println("НОД чисел " + a + " и " + b + " = " + nod);

    }
    public static int min (int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else return num2;
    }

    public static int max (int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else return num2;
    }
}