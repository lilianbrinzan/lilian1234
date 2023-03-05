import java.util.Scanner;
import java.util.InputMismatchException;

// Калькулятор для вычисления периметра комнаты
// На входе: a и b - стороны прямоугольника
// На выходе: периметр прямоугольника
// Ключевой алгоритм: p = 2 * (a + b)
// Интерфейс: защититься от ошибок пользователя при вводе a и b, нельзя вводить символы вместо цифр
// и отрицательные числла в качестве длины сторон комнаты.
// Предложить пользователю продолжить работу калькулятора
// до тех пор, пока он не откажется.
// Проверку введенного числа на позитивность (a > 0) выполнить в вызываемой функции,
// которая сообщает о неправильном вводе данных.

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Давай подсчитаем периметр комнаты.");
        char choice_y_or_n;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите длину 1-й строны прямоугольной комнаты:");
                int a = scanner.nextInt();
                System.out.println("Введите длину 2-й строны прямоугольной комнаты:");
                int b = scanner.nextInt();
                System.out.println("Периметр комнаты = " + 2 * (a + b));
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода, вы ввели не число!");
            }
            System.out.println("Продолжим? - y/n");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else {
                continue;
            }
        }

    }
}
