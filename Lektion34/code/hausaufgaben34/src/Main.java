import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Liste der Fälle");

        enum Menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }

        List<String> todoList = new ArrayList<>();

        while (true) {
            for (Menu myMenu : Menu.values()) {
                System.out.print(myMenu + " | ");
            }
            System.out.println();
            System.out.println("Wählen Sie, was Sie tun möchten: Drücken Sie 1, 2, 3 oder 4");
            int choice = readMenueChoice();
            Menu myMenu = Menu.ADD;

            switch (choice) {
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
                    System.out.println("Vielen Dank, auf Wiedersehen!");
                    return;
                }
                default:{
                    System.out.println("Velen die Nummer 1,2,3 und 4");
                }

            }
        }

    }
    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Muss die Nummer enter, nicht Simbol");
        }
        return menuChoice;
    }
    public static void add_task(List<String> tasks) {
        System.out.println("Geben Sie die Aufgabe ein:");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine();
        tasks.add(task);
    }

    public static void print_tasks (List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1;
            System.out.println(n + ". " + tasks.get(i));
            if (tasks.size() == 0) {
                System.out.println("Es sind noch keine Aufgaben vorhanden, fangen Sie an, sie hinzuzufügen.");
            }
        }
    }

    public static void remove_task(List<String> tasks) {
        System.out.println("Wählen Sie die zu löschende Aufgabennummer aus: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num >= 1 && task_num <= tasks.size()) {
            int n = task_num - 1;
            tasks.remove(n);
        } else {
            System.out.println("Es wurde die falsche Aufgabennummer ausgewählt.");
            return;
        }
    }
}