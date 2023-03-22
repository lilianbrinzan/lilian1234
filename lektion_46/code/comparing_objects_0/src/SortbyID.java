import java.util.Comparator;

public class SortbyID implements Comparator <Employee> {
    // нужно имплементировать (создать, прописать) метод compare (O1 o1, O2 o2)

    public int compare ( Employee a, Employee b) {
        return a.empID - b.empID; // сравниваем номера в математическом порядке
                                  // при условии, что у сотрудников идет нумерациия в возрастающем порядке

    }

}
