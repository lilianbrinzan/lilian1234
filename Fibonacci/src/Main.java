public class Main {
    public static void main(String[] args) {

        //System.out.println("Lektion 18 Hausaufgaben_4");

        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci Serries of " + 20 + " numbers   ");
        for (int i=1; i<=20; i++)
        {
            System.out.print(num1 + " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(" ");
        System.out.println("Finisch !!! ");



        //System.out.println("Lektion 18 Hausaufgaben_4_Array");

        int[] numbersFibonaci = {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181};

        System.out.println("Fibonacci Serries of " + 20 + " numbers   ");
        for (int i=0; i< numbersFibonaci.length; i++)
        {
            System.out.print(numbersFibonaci[i] + " " );

        }
        System.out.println(" ");
        System.out.println("Finisch !!! ");
    }

}