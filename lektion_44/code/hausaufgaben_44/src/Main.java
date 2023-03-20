import java.util.TreeSet;
public class Main {
    // Hausaufgaben 44
    // Создайте TreeSet и внесите в него федеративные земли Германии.
    // Выведите список земель на печать.
    public static void main(String[] args) {
        System.out.println(".. наполнения TreeSet");

        TreeSet ts = new TreeSet();

        // Добавляем элементы к набору

        ts.add("Baden-Württemberg");
        ts.add("Bayern");
        ts.add("Berlin");
        ts.add("Brandenburg");
        ts.add("Bremen");
        ts.add("Hamburg");
        ts.add("Hessen");
        ts.add("Mecklenburg-Vorpommern");
        ts.add("Niedersachsen");
        ts.add("Nordrhein-Westfalen");
        ts.add("Rheinland-Pfalz");
        ts.add("Saarland");
        ts.add("Sachsen");
        ts.add("Sachsen-Anhalt");
        ts.add("Schleswig-Holstein");
        ts.add("Thüringen");
        System.out.println("Пример со строками");
        // Выводим на печать
        System.out.println(ts);

    }
}