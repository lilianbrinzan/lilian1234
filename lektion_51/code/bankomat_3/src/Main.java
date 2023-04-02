/**
 *       Банкомат
 * Разработайте интерфейс банкомата на Java.
 * Работая над проектом, вы должны создать пять классов:
 *   - для владельца счета,
 *   - самого счета,
 *   - транзакции,
 *   - банка
 *   - банкомата.
 * После ввода идентификатора и пин-кода пользователи должны получить доступ к записям о каждой транзакции,
 * а также получить возможность класть деньги на депозит, снимать средства и делать переводы.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.InputMismatchException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Банкомат PostBank");
        // Создаём fail.txt
        String path = "C:\\Users\\AIT TR Student\\Documents\\javakurs2023\\lektion_51\\code\\bankomat_3\\src\\";
        String fileName = "data.txt";
        String data = "Добрый день, пожалуйста введите v tada.txt свой 4-значный пин-код. ";
        System.out.println(data);

        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {

                String data1 = myReader.nextLine(); // считываем строку
                System.out.println(data1); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

        // Создаём Atm
        Atm atm1 = new Atm(123456789, 1234,"DE123456789", "Stollenstr.12");
        // Создаём Account
        Account d1 = new Account(123456789, 1234);
        // назначаем Account на Atm
        d1.go(atm1);
        System.out.println("Account = " + atm1.getAccount().iban);
        // Создаём Transaction
        Transaction t1 = new Transaction(100,200,300);
        t1.go(atm1);
        System.out.println("доступ к записям о каждой транзакции " + t1);

        System.out.println();
        System.out.println("Список дел");

        enum Menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }
        List<String> todoList = new ArrayList<>(); // инициализация листа со списком задач

        // начало раьоты с пользователем
        while (true) {

            for (Menu myMenu : Menu.values()) { // цикл for each - Список, который перебираем, параметр цикла, значения
                System.out.print(myMenu + " | "); // опертор с параметром цикла
            }
            System.out.println();
            System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");
            int choice = readMenueChoice(); // выбор пользователя считаем в методе readMenuChoice
            Menu myMenu = Menu.ADD; // начальное значение выбора в меню

            switch (choice) {
                // case (1): {}
                case 1: {
                    myMenu = Menu.ADD;
                    add_task(todoList);
                    print_tasks(todoList);  
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT;
                    print_tasks(todoList);
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE;
                    remove_task (todoList);
                    print_tasks(todoList);
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("Спасибо, до свидания!");
                    return;
                }
            }
        }


    }

    // метод, который считывает выбор пользователя из меню
    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        menuChoice = sc.nextInt();
        return menuChoice;
    }
    // метод для добавления задачи в список задач
    public static void add_task(List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine(); // считали строку с задачей
        tasks.add(task); // в список tasks вносим методом add новое значение
    }

    // этот метод печатает список задач
    public static void print_tasks (List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1; // задаем номер задачи в списке
            System.out.println(n + ". " + tasks.get(i)); // печатаем задачу
            if (tasks.size() == 0) {
                System.out.println("Задач еще нет, начните их добавлять.");
            }
        }
    }

    // этот метод удалляет выбранную пользователем задачу по ее номеру
    public static void remove_task(List<String> tasks) {
        System.out.println("Выберите номер задачи для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num >= 1 && task_num <= tasks.size()) {
            int n = task_num - 1; // индекс задачи на 1 меньше, чем ее номер на экране
            tasks.remove(n); // удаляем задачу из списка с индексом n1
        } else {
            System.out.println("Выбран неверный номер задачи.");
            return;
        }
    }
}