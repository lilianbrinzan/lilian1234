import java.util.List;
// hausaufgaben 53
public class Main {
    /**
     * Используя принципы отбрасывания констант и оставления только максимально быстро растущего элемента
     * найти асимптотики для следующих функций:
     *
     * f(n) = 9n +73
     * f(n) = 235
     * f(n) = n^2 + 7n +123
     * f(n) = n^3 +2000n +8765
     * f(n) = n + sqrt(n)
     */

    //public int findDominant;

    //  f(n)=235..............f(n)=1
    //  O(1) ... Ordnung 1 .. - алгоритм с константным временем
    public int getLenght (List <Integer> ints){
        boolean getLenght = false;
        System.out.println(getLenght);
        return ints.size();
    }

    // f(n)=9n+73............f(n)=n
    //  O(n) ... Ordnung n  - линейный алгоритм
    public int sum (List <Integer> ints ){
        for (int i = 0; i < ints.size(); i++) {
            // body
            System.out.println();
        }
        return 2;
        //return sum;
    }

    // f(n)=n^2+7n+123........f(n)=n^2
    // O(n^2)... Ordnung n^2... - квадратичный
    public static void drawTriangle(int n){
        for ( int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }




}