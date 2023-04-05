public class Main {
    public static void main(String[] args) {
        // Самостоятельно повторить написание алгоритма
        // двоичного поиска и протестировать его

        System.out.println("Fibonacci Serries of " + 15 + " Numbers ");
        int num1 = 0;
        int num2 = 1;
        for (int i=1; i<=15; i++) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(" ");
    }
}