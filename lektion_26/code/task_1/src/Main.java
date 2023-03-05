import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Список группы 23-2");

        HashMap<String, Integer> group23 = new HashMap<String, Integer>(); // инициализация HashMap

        group23.put( "Vadim", 25);
        group23.put( "Leonid B", 25);
        group23.put( "Lilian", 40);
        group23.put( "Viacheslav", 25);
        group23.put( "Dina", 36);
        group23.put( "Katerina Z", 44);
        group23.put( "Katerina K", 33);
        group23.put( "Валентин", 40);
        group23.put( "Oleg", 38);
        group23.put( "Жека", 19);
        group23.put( "Yehor", 32);
        group23.put( "Maryna", 33);
        group23.put( "Leonid K", 59);

        for (String i : group23.keySet()) {
            System.out.println("key: " + i + " value: " + group23.get(i));
        }

        // System.out.println(group23.("Leonid K"));


    }
}