import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Hausaufgaben30
        System.out.println("Übersetzung vom 10 Zahlensystem zum 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine positive Ganzzahl ein: ");
        int num = 0;
        boolean wrong_input = false;
        int division = 1;
        int rest = 0;

        ArrayList<String> binary_num = new ArrayList<>();

        try {
            num = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Sie können keine Zeichen eingeben!");
            wrong_input = true;
        }

        System.out.println(num);

        int i = 0;

        while (num > 0) {
            rest = num % 2;
            binary_num.add(i, String.valueOf(rest));
            num = num / 2;
            i++;
        }

        System.out.println("Array Größe: " + binary_num.size());
        System.out.println("Array der empfangenen Ziffern: " + binary_num);

        System.out.println("Binärzahl: ");
        for (int j = binary_num.size() - 1; j >= 0; j--) {
            System.out.print(binary_num.get(j));

        }
    }
}