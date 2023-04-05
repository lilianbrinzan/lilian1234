import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    /**
     * 1.Есть лист имен, в котором некоторые имена повторяются. С помощью сета  написать метод, который вернет лист
     *    без повторяющихся элементов.
     *    List<String> withoutDuplicates (List<String> names)
     *    [Jack, Mary, Peter, Ann, Mary, Jack] ->[ Jack, Mary, Peter, Ann]
     */

    public List<String> withoutDuplicates (List<String> names){

        Set<String> set = new HashSet<>(names);

        return new ArrayList<>(set);
    }


    /*2. Есть список имен, в котором некоторые имена повторяются. С помощью сета написать метод, который вернет
    повторяющиеся элементы из этого листа
    List<String> duplicates (List<String> names)
    [Jack, Mary, Peter, Ann, Mary, Jack]-> [Jack, Mary]
     */
    List<String> duplicates (List<String> names){
        Set<String> set = new HashSet<>();
        List<String> getDuplicates = new ArrayList<>();

        for (String s:names){
            if ( !set.add(s) && !getDuplicates.contains(s)) {
                getDuplicates.add(s);
            }
        }
        return getDuplicates;
    }
}