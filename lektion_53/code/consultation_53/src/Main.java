import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
       // System.out.println("Hello world!");
       public static void main(String[] args) {
           System.err.println("Error (err..or) printing");
           System.out.println("Not error printing");

       }


       //  O(1) ... Ordnung 1
        public int getLenght (List <Integer> ints){

             return ints.size();
        }

        //  O(n) ... Ordnung n
        public int sum (List <Integer> ints ){

            for (int i = 0; i < ints.size(); i++) {
                // body
            }
            return 2;
            //return sum;


            // O(log n)

            // O(nLogn)

            // O(n^2)
        }

        // masiv
        // length/2
        // [5,6,6,5,6,5]
    // есть массив целых положительных чисел. Найти элемент, который встречается  в
    // массиве больше > length/2 (доминантный). Если такого нет, вернуть -1
    //[5,6,6,5,6,5] 5:3  6:3
    //[1,1,1,0,0,0,0] 1:3   0:4

    public int findDominant(int[] ints){
            Map <Integer, Integer> occToNumber = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            if (occToNumber.containsKey(ints[i]))
                occToNumber.put(ints[i],occToNumber.get(ints[i]) +1);
            else occToNumber.put(ints[i], 1);

        }
        int counter = 0;
        int dominant = 0;

        for (int key: occToNumber.keySet()){
            if(occToNumber.get(key)>counter){
                counter = occToNumber.get(key);
                dominant = key;
            }
        }
        if(counter>ints.length/2)
            return dominant;
        return -1;

    }




}