import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception{



        CountInt2 countInt = new CountInt2();
        countInt.start();
        countInt.join();

        System.out.println("Counter is ");
        System.out.println(countInt.getCounter());
    }




    //2.написать метод, увеличивающий счетчик  от 0 до 1000 и выводящий результат на экран.
    // Метод должен быть создан для использования в режиме многопоточности.
    // Запустить в классе Main.
    // Реализовать двумя способами -  через класс Thread  и интерфейс Runnable





}