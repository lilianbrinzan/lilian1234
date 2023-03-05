import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Hausaufgaben 22.1
        System.out.println("Mitarbeiter");

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Ion");
        nameList.add("Serjiu");
        nameList.add("Tatiana");
        nameList.add("Victor");
        nameList.add("Elena");
        nameList.add("Claus");

        System.out.println(nameList); // "грубая" continutul la printat

        int size = nameList.size(); // aflați dimensiunea foii
        System.out.println("Die Größe des Blattes, das Sie erstellt haben: " + size);

        int index = nameList.indexOf("Elena");
        System.out.println("Nummer  " + "Elena" + " auf der Liste " + index );

        nameList.remove(4 ); // Îndepărtați numărul 4 de pe foaie
        System.out.println(nameList); // imprimare după ștergere

        boolean BrandPresents = nameList.contains("Claus"); // verificarea prezenței
        System.out.println(BrandPresents);


        // se verifică dacă obiectul este mâncat în listă și apoi nu este adăugat
        if (nameList.contains("Claus") == false) {
            nameList.add("Claus");
        }
        System.out.println(nameList);

        // să adauge marca lipsă la listă dacă aceasta nu se află pe listă
        if (nameList.contains("Alex") == false) {
            nameList.add("Alex");
        }
        System.out.println(nameList);

        // tipărirea foii de index
        for (int i=0; i < nameList.size(); i++) {
            System.out.println(i + " " + nameList.get(i));
        }

        System.out.println();

        // Sortarea foilor
        Collections.sort(nameList); // apel pentru un algoritm de sortare
        System.out.println(nameList);

        for (int i=0; i < nameList.size(); i++) {
            System.out.println(i + " " + nameList.get(i));
        }
    }
}