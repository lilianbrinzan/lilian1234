import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class Main {
    public static void main(String[] args) {
        //Lektion 20 Hausaufgaben 1
        Scanner scanner = new Scanner(System.in);
        char choice_y_or_n;
        while (true) {
            try {
                double num1, num2;
                System.out.println("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                System.out.println("Enter an operator(+,-,/,*)");
                char operator = scanner.next().charAt(0);
                double result = 0.0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("ERROR !!!");
                        return;
                }
                System.out.println("Antwort ist : " + result);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage() + " Делить на ноль ??? ");
                //Dividieren durch Null Funktioniert, das ist :  Infinity
                //Antwort PC ist  Бесконечность
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage() + "Sie haben etwas anderes anstelle von Zahlen eingegeben, versuchen Sie es erneut");
            }
            System.out.println("Weiter?   y / n ");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;

        }
        System.out.println("Fertig !!!");
    }
    }




