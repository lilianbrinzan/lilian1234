import java.util.Comparator;
public class SortbyYear implements Comparator <Dog> {
    // нужно имплементировать (создать, прописать) метод compare (O1 o1, O2 o2)

    public int compare ( Dog a, Dog b) {
        return a.year - b.year;  // сравниваем номера в математическом порядке
                     // при условии, что у Dog идет нумерациия в возрастающем порядке

    }

}
