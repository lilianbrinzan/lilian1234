import java.util.TreeSet;
public class Main {
    // Hausaufgaben 44
    // Создайте TreeSet и внесите в него федеративные земли Германии.
    // Выведите список земель на печать.
    public static void main(String[] args) {
        System.out.println(".. наполнения TreeSet");

        TreeSet ts = new TreeSet();

        // Добавляем элементы к набору

        ts.add("Hamburg\n");
        ts.add("Hessen\n");
        ts.add("Mecklenburg-Vorpommern\n");
        ts.add("Niedersachsen\n");
        ts.add("Nordrhein-Westfalen\n");
        ts.add("Rheinland-Pfalz\n");
        ts.add("Saarland\n");
        ts.add("Sachsen\n");
        ts.add("Sachsen-Anhalt\n");
        ts.add("Schleswig-Holstein\n");
        ts.add("Thüringen\n");
        ts.add("Bayern\n");
        ts.add("Berlin\n");
        ts.add("Brandenburg\n");
        ts.add("Baden-Württemberg\n");
        ts.add("Bremen\n");
        ts.add("Berlin\n");


        System.out.println("Пример со строками");
        // Выводим на печать
        System.out.println(ts);

    }
}