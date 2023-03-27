import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Банкомат ");
        /**
         *       Банкомат
         * Разработайте интерфейс банкомата на Java.
         * Работая над проектом, вы должны создать пять классов:
         *   - для владельца счета,
         *   - самого счета,
         *   - транзакции,
         *   - банка
         *   - банкомата.
         * После ввода идентификатора и пин-кода пользователи должны получить доступ к записям о каждой транзакции,
         * а также получить возможность класть деньги на депозит, снимать средства и делать переводы.
         */

        // Создаём Atm
        Atm atm1 = new Atm(123456,"1");
        // Создаем account
        Account d1 = new Account(123456, 1234);
        // назначаем account на Atm
        d1.go(atm1);
        System.out.println("Account.... " + atm1.getAccount().iban);

        ///////////////////////////////////////////////////////////////



        String path = "C:\\Users\\AIT TR Student\\Documents\\javakurs2023\\lektion_49\\code\\bankomat\\src\\";
        String fileName = "data.txt";
        createFile(path, fileName); // sozdaeom fail
        String data = " Банкомат ...PostBank...";
        writeDataInFile (path, fileName, data); // scriem datele in fail/ pisem datu v fail
        String d = readDataFromFile( path, fileName);
        System.out.println("procitano is faila :" + '\n' + d);



    }
    private static void createFile (String path, String fileName){
        try {
            File myFile = new File(path + fileName); // Укажите свое имя файла fileName

            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }

    // Запись в файл текста
    private static void writeDataInFile(String path, String fileName, String data ){
        try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write(data); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе

        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
    }

    private static String readDataFromFile ( String path, String fileName){
        String data = "";
        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {

                data = myReader.nextLine(); // считываем строку
                //System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }


}