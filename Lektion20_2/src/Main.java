public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // happines[i][j] =(int)((Math.random()*(b-a+1)+a));
        // 1 0 0 0 1 1 0 0  1 0
        // 1 0 1 0 1 1 0 0  1 0
        // 1 0 1 0 1 1 1 0  1 0

        // Lektion 20 Hausaufgaben 2

        int[][] array = new int[10][10];
        // for (int i = 0; i < array.length; i++ ) {
        //  for (int j = 0; j < array.length; j++) {
        //     array[i][j] =(int)((Math.random() * (1 - 0 + 1) + 0));
        //     System.out.print(array[i][j] + " " );
        //  }
        //  System.out.println();
        // }

        int sum = 0;

        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] =(int)((Math.random() * (1 - 0 + 1) + 0));
                System.out.print(array[i][j] + " " );
                sum  += array[i][j];
            }
            System.out.print(" // summa = " + sum +"//");
            System.out.println();
            sum = 0;
        }

    }
}