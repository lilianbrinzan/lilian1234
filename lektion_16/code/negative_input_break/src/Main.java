import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, мир! Hallo Welt!");
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < 10; i++) {
            System.out.println("Введите целое число: ");
            int num = scanner.nextInt();
            System.out.println("Вы ввели число: " + num);
            if (num < 0){
                System.out.println("Вы ввели отрицательное число, ввод далее запрещен.");
                break;}
        }

    }
}