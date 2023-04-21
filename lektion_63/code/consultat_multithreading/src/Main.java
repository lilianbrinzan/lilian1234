import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception{

        //Start with Runner
        new Runner().start();
        new Runner().start();
        new Runner().start();

        //Start with RunnerRunnable
        new Thread(new RunnerRunnable()).start();
        new Thread(new RunnerRunnable()).start();


    }

    //1.Создать класс, наследующий Thread и класс реализующий интерфейс Runnable.
    // Переопределить метод run() в обоих таким образом, чтобы при создании и последующем вызове потока
    // 5 раз было выведено в консоль hello world.
    // Создать в классе Main и запустить несколько потоков.



}