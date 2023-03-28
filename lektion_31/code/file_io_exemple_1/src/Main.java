import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\AIT TR Student\\Documents\\javakurs2023\\lektion_31\\code\\file_io_exemple_1\\src\\";

        // new C:\Users\AIT TR Student\Documents\javakurs2023\lektion_31\code\file_io_exemple_1\src
        // alt C:\Users\AIT TR Student\IdeaProjects\cohort23.2\Lektion31\code\file_io_exemple_1\src\

        // Создание нового файла
        System.out.println("Пример работы с файлом - СОЗДАНИЕ НОВОГО ФАЙЛА");


        try {
            File myFile = new File ( path + "test.txt"); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

        // Запись в файл текста
        System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt"); // используем класс и его метод
            myWriter.write("Это НАША запись текста в файл."); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }

        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        

    }

}