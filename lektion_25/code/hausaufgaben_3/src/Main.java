import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        //**Задача:** Написать приложение, которое позволит понять,
        // из каких мест на данную почту приходят письма.
        // Что на входе: Письмо с почтовым индексом (post_code).
        // Что на выходе: список уникальных индексов, откуда приходили письма.
        // Интерфейс: пользователь (операционист) вводит почтовый индекс с письма,
        // ввод продолжается до тех пор, пока пользователь готов продолжать работу.
        // Ключевой алгоритм: заносим индекс из адреса письма в HashSet,
        // эта структура данных сама заботиться, об уникальности,
        // содержащихся в ней элементов, повторный ввод почтового индекса не "испортит" множество уникальных индексов
        // ии его не надо "обрабатывать.
        // Для ввода организуем бесконечный цикл while (true)

        System.out.println("Eingabe der VIN von ankommend"); // Приглашение пользователю
        Scanner userVin = new Scanner(System.in); // считываем ввод пользователя

        String p_vin = ""; // переменная для почтового индекса
        char userChoice; // переменная для выбора пользователя
        int hash = 0;

        HashSet<String> autoVin = new HashSet<String>(); //инициализация HashMap

        do {
            System.out.println("Eingeben der VIN ");
            p_vin = userVin.next(); // Cчитываем от пользователя индекс
            autoVin.add(p_vin); // Добавили индекс в HashMap
            // System.out.println(p_code.hashCode());
            // _______________
            // Интерфейс продолжения работы
            System.out.println("Um zu stoppen, drücken Sie S, um fortzufahren - irgendein anderer Buchstabe.");
            userChoice = userVin.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {
                break;
            }
        } while (true);

        System.out.println("Eingeführt in ein Tag der VIN ");
        System.out.println(autoVin);
        System.out.println();
        // печать циклом for each
        for (String st : autoVin) {
            System.out.println(st);
        }


        System.out.println();

         */

        /*{
            System.out.println("Проверка, есть ли уже такой почтовый индекс?");
            System.out.println("Введите индекс письма: ");
            p_code = userInput.next(); // Cчитываем от пользователя индекс
            if (postCode.contains(p_code)) { // .contains - vt метод, который проверяет наличие, возвращает true или falsh
                System.out.println("Да, такой индекс уже есть.");
            } else {
                System.out.println("Нет, такого индекса еще нет.");
            };
            // Интерфейс продолжения проверки
            System.out.println("Для для остановки проверки нажмите s, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

       */

        // Lektion 25 Hausaufgaben 3 VIN
        System.out.println("Eingabe der VIN von ankommend");
        Scanner userVin = new Scanner(System.in);

        String p_vin = "";
        char userChoice;
        int hash = 0;

        HashSet<String> autoVin = new HashSet<String>();

        do {
            System.out.println("Eingeben der VIN ");
            p_vin = userVin.next();
            autoVin.add(p_vin);

            System.out.println("Um zu stoppen, drücken Sie S, um fortzufahren - irgendein anderer Buchstabe.");
            userChoice = userVin.next().toLowerCase().charAt(0);
            if (userChoice == 's') {
                break;
            }
        } while (true);

        System.out.println("Eingeführt in ein Tag der VIN ");
        System.out.println(autoVin);
        System.out.println();
        // печать циклом for each
        for (String st : autoVin) {
            System.out.println(st);
        }

        System.out.println();


    }
}
