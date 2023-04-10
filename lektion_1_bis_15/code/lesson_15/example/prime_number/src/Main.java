import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задаем начальные данные
        System.out.println("Let's check whether number is prime or not.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number :");
        int n = scanner.nextInt();
        System.out.println("Your input number = " + n);

        // Определяем, простое число или нет
        boolean isPrime = true;

        for (int i = 2; i < n; i++) { // цикл for проверяет разделилось ли введенное число на все целые числа от 2
            // меньшие этого введенного числла
            int div = n % i;
            if (div == 0){
                System.out.println("Число разделилось нацело на " + i);
                isPrime = false; // если разделилось нацело, то значит число НЕ является простым
            }
        }
        // выводим результат проверки
        if (isPrime) {
            System.out.println("Number " + n + " is prime.");
        }
        else {
            System.out.println("Number " + n + " is NOT prime.");
        }
    }
}