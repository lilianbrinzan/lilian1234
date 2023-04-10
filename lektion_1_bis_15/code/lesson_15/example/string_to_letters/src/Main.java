import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's read the word by letters.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = scanner.nextLine();
        System.out.println("Your input: " + word);
        int n = word.length(); // определяем длину слова
        System.out.println("Length of word is: " + n);
        char ch = ' '; // переменная для символа (буквы)
        for (int i = 0; i < n; i++){ // .charAt() - начинает с нулевого индекса
            ch = word.charAt(i);
            System.out.print(ch + " | ");
        }
    }
}