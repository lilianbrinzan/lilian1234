import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

// Пример с выходом за пределы размера массива:
// Задать массив на 3 элемента
// Обратиться к элементу массива с индексом больше 3 - программа должна закончиться аварийно
// Применить try ... catch для обработки ошибки обращения за длину массива
// Протестировать программу

// Пример с делением на 0 и обработкой неправильного ввода (символы вместо чисел)
// Сделать калькуллятор для деления с защитой от деления на 0 и ввода символов вместо цифр

public class Main {

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner scann = new Scanner(System.in);

        char choice_y_or_n;

        while (true) {
            try {
                System.out.println("Введите целое число a: ");
                int a = scann.nextInt();
                System.out.println("Введите целое число b: ");
                int b = scann.nextInt();
                int с = div(a, b);
                System.out.println("Частное " + a + " / " + b + " = " + с);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage() + " Делить на ноль нельзя!");
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка " + ex.getMessage() + " означает, что нельзя вводить символы!");
            }
            System.out.println("Продолжить? y/n ");
            choice_y_or_n = scann.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;
        }
    }
}