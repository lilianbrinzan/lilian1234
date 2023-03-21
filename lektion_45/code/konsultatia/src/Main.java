import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        System.out.println("Konsultatia compareTo-example");

        // sosdati 5 compiutera (oviecti nasheva Classa Computer)
        // sosdati TreeSet - klass , stuctura  dlea hronenia danih
        // polojim v TreeSet eti 5 obiectov
        // raspechatati TreeSet
        // ubedidtsea , chto ....

        Computer comp1= new Computer("desktop", 8, 512, "windows 10 Home");
        Computer comp2= new Computer("notebook", 16, 1024, "windows 10 Pro");
        Computer comp3= new Computer("server", 64, 2048, "windows Server");
        Computer comp4= new Computer("notebook", 32, 256, "MacOS");
        Computer comp5= new Computer("desktop", 32, 128, "Linux");

        TreeSet computers = new TreeSet<>();
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);

        System.out.println("Naschi compiuteri : ");
        System.out.println(computers);





    }
}