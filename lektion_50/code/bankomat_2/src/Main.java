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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Банкомат ");

        // Создаём Atm
        Atm atm1 = new Atm(123456, 1234,"De123456", "Stollenstr.12");
        // Создаем Account
        Account d1 = new Account(123456, 1234);
        // назначаем account на Atm
        d1.go(atm1);
        System.out.println("Account = " + atm1.getAccount().iban);
        // Создаём Transaction
        Transaction t1 = new Transaction(100,200,300);
        t1.go(atm1);
        System.out.println("доступ к записям о каждой транзакции " + t1);





        String path = "C:\\Users\\AIT TR Student\\Documents\\javakurs2023\\lektion_50\\code\\bankomat_2\\src\\";

        String data = "Банкомат ...PostBank...введите свой 4-значный пин-код. ";
        String fileName = "data.txt";

        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {

                String data1 = myReader.nextLine(); // считываем строку
                System.out.println(data1); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }



    }

}