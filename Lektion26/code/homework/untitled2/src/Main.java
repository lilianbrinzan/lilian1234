import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Список группы 23-2");

        HashMap<String, Integer> group23 = new HashMap<String, Integer>();
        group23.put( "Vadim",    15205001);
        group23.put( "Leonid B", 15205002);
        group23.put( "Lilian",   15205003);
        group23.put( "Viacheslav", 15205004);
        group23.put( "Dina",       15205005);
        group23.put( "Katerina Z", 15205006);
        group23.put( "Katerina K", 15205007);
        group23.put( "Валентин",   15205008);
        group23.put( "Oleg", 15205009);
        group23.put( "Жека", 15205010);
        group23.put( "Yehor",   15205011);
        group23.put( "Maryna",  15205012);
        group23.put( "Leonid K",15205013);

        for (String i : group23.keySet()) {
            System.out.println("key: " + i + "     nummer: " + group23.get(i));
        }

    }
}