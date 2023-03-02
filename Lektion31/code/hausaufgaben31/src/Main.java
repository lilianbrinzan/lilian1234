import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) throws IOException {
        //Hausaufgaben31
        String path = "C:\\Users\\AIT TR Student\\IdeaProjects\\cohort23.2\\Lektion31\\code\\hausaufgaben31\\src\\";

        // Создание нового файла
        System.out.println("Beispiel für die Arbeit mit einer Datei - NEUE DATEI erstellen");

        try {
            File myFile = new File ( path + "test.txt"); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("Die Datei ist erstellt: " + myFile.getName());
            } else {
                System.out.println("Die Datei existiert schon.");
            }
        } catch (IOException e) {
            System.out.println("Es ist ein Fehler passiert.");
            e.printStackTrace();
        }

        // Запись в файл текста
        System.out.println("Beispiel für die Arbeit mit einer Datei - RECORD TO FILE");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt"); // используем класс и его метод
            myWriter.write("Das ist UNSER Schreiben von Text in eine Datei."); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Das Schreiben in die Datei war erfolgreich."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Es ist ein Fehler passiert."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }

        // Чтение текста из файла
        System.out.println("Beispiel für die Arbeit mit einer Datei - READ from FILE");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Es ist ein Fehler passiert.");
            e.printStackTrace();
        }
    }
}