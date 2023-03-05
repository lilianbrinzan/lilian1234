import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поиск элемента массива");

        // Задать массив случайных целых чисел от 1 до 10 включительно.
        // Запросить у пользователя произвольное целое число от 1 до 10.
        // Проверить, встретилось ли введенное число в массиве и сколько раз.
        // Поиск в массиве реализовать как метод, на входе которого массив и искомое число, на выходе -
        // какое количество раз оно встретилось.
        //   ТИП[] имя_массива = new ТИП[размер];
        // int n = (int)(( Math.random() * (b - a + 1) + a)) - генерирует случайное **целое** число в интервале [a, b]
        //   a - может быть, b - может быть
        Scanner scann = new Scanner(System.in);

        int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int)(( Math.random() * (10 - 1 + 1) + 1));
            // System.out.println("Задуманный маасив :" + arrayIntRandom[i]);
        }
        System.out.println("Введите целое число от 1 до 10 ");
        int num = scann.nextInt();

        int с = findNumber (arrayIntRandom, num);

        System.out.println("Число " + num + " встретилось в массиве " + с + " раз.");
    }

    public static int findNumber(int array[], int find_num) {
        int count = 0; // определили счетчик
        for (int i = 0; i < array.length; i++) { // пробегаем по всем элементам массива
            if (array[i] == find_num) { // если в массиве найден искомый элемент
                count++; // увеличиваем счетчик на 1
            }
        }
        return count;
    }
}