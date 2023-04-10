import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate n! (factorial)");
        System.out.println("Input positive integer number :");
        int number = scanner.nextInt();

        // calculate factorial
        long nfactorial = 1;
        for (int i = 1; i <= number; i++ ){
            nfactorial = nfactorial * i;
            System.out.println(nfactorial);
        }
        System.out.println("n! = " + nfactorial);
    }
}