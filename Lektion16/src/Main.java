import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        for (int i=1; i <= 10; i++) {
            System.out.println("Schreiben Sie eine Nummer: ");
            int num = scanner.nextInt();
            System.out.println("Sie eingeben die Nummer: " + num);

            if (num %2 == 1) {
                System.out.println(" Das ist Nicht richtige Nummer ");
                break;}


        }
        System.out.println("Fertig");
    }

}