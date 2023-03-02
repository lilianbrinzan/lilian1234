import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coffee Shop");
        // Какое кофе будем продавать:
        // ESPRESSO - 2.30 euro | 3 euro
        // AMERICANO - 2.10 euro| 2 euro
        // CAPUCCINO - 3.50     | 4 euro
        // LATTE - 4.20         | 5 euro
//_______________________________________________
        enum CoffeeType {
            ESPRESSO,
            AMERICANO,
            CAPUCCINO,
            LATTE,
        }

        for (CoffeeType myCoffee: CoffeeType.values()) {
            System.out.println(myCoffee);
        }
        System.out.println("Выберите свой кофе. Нажмите 1, 2, 3 или 4");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        CoffeeType myCoffee = CoffeeType.ESPRESSO;

        int coffeePrice = 0;

        //выбор пользователя
        switch (choice) {
            case 1: {
                myCoffee = CoffeeType.ESPRESSO;
                break;
            }
            case 2: {
                myCoffee = CoffeeType.AMERICANO;
                break;
            }
            case 3: {
                myCoffee = CoffeeType.CAPUCCINO;
                break;
            }
            case 4: {
                myCoffee = CoffeeType.LATTE;
                break;
            }
        }
        // назначаем цену


        switch (myCoffee) {
            case AMERICANO -> {
                coffeePrice = 2;
                System.out.println("Стоимость " + coffeePrice + " euro");
                break;
            }
            case ESPRESSO -> {
                coffeePrice = 3;
                System.out.println("Стоимость " + coffeePrice + " euro");
                break;
            }
            case CAPUCCINO -> {
                coffeePrice = 4;
                System.out.println("Стоимость " + coffeePrice + " euro");
                break;
            }
            case LATTE -> {
                coffeePrice = 5;
                System.out.println("Стоимость " + coffeePrice + " euro");
                break;
            }
        }

        System.out.println("С вас " + coffeePrice + " euro");
        System.out.println("Переходите к оплате.");

    }
}