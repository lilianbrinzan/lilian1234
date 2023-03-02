import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*System.out.println("Латинский алфавит");
        // Заполним множество символами латинского алфавита в цикле for
        // код символа "A" - 65, код символа "B" - 66, и т.д. до код "Z" = 90.

        HashSet<String> latAlphabet = new HashSet<String>(); //инициализация HashSet

        System.out.println();

        // заполняем HashSet в цикле
        for ( int i = 0 ; i < 26 ; i++ ) {
            latAlphabet.add(String.valueOf((char)(i + 65)));
            // latAlphabet.add(String.valueOf((char)(i + 65))); // берем букву, соответствующую символу
        }

        System.out.println(latAlphabet); // печать полученного сета

        // Добавим опять, еще раз букву K
        latAlphabet.add("K");
        System.out.println();
        System.out.println(latAlphabet); // печать сета после попытки добавить букву К еще раз
        */
////////////////////////////////////////////////////////////////////////

        System.out.println("Добрый день!");
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

        System.out.println("Ввод индексов с приходящих на почту писем"); // Приглашение пользователю
        Scanner userInput = new Scanner(System.in); // считываем ввод пользователя

        String p_code = ""; // переменная для почтового индекса
        char userChoice; // переменная для выбора пользователя
        int hash = 0;

        HashSet<String> postCode = new HashSet<String>(); //инициализация HashMap

        do {
            System.out.println("Введите индекс письма: ");
            p_code = userInput.next(); // Cчитываем от пользователя индекс
            postCode.add(p_code); // Добавили индекс в HashMap
            // System.out.println(p_code.hashCode());
            // _______________
            // Интерфейс продолжения работы
            System.out.println("Для для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

        System.out.println("Введенные за смену почтовые индексы: ");
        System.out.println(postCode);
        System.out.println();
        // печать циклом for each
        for (String st : postCode) {
            System.out.println(st);
        }


        System.out.println();

        do {
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









    }
}