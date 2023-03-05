import java.util.Scanner;

// Дано n. Написать программу, которая вычисляет сумму S = 2 + 4 + … + n.

public class Main {

    public static void main(String[] args) {
        int n = 1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input integer");
        n = scanner.nextInt();
        System.out.println("You input " + n);
        int sum =0;

        for (int i=1; i<=n; i++) {
            if (i%2==1) continue; // нечетные значения i пропустить
            sum = sum+i; // суммировать только четные значения i
        }
        System.out.println("Summa iven numbers <= n is: " + sum);
    }
}