import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binarnii poisc v Massive");

        // На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
        // массив отсортирован от меньшего к большему элементу
        // пользователь вводит интересующее его число - есть оно в массиве или нет?
        // на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
        // ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
        // продолжать,пока не будет найден искомый элемент массива или не закончится массив

        int [] array = { 3, 5, 19, 22, 33, 46, 51, 64, 85, 99  };
        int lenght = array.length;
        System.out.println("Bvv" + lenght);

        Scanner sc = new Scanner( System.in);
        System.out.println("B....");
        int element = sc.nextInt();
        System.out.println("B...." + element + " v masive.");

        // zadaiom
        boolean hasElement = false;
        int left = 0; // levii
        int right = lenght - 1; // pravii
        int middle = left + (right - left)/2; // eto index seredini massiva

        while ( left < right){
            if (element < array[middle]){ // esli iskommi element v levii plovini
                right = middle -1;

            } if (element < array[middle]) {
                left = middle + 1;
            } else {
                hasElement = true;
                break;
            }

            middle = left + (right - left)/2; // vicesleam novuiu seredinu

        }

        System.out.println(hasElement);





    }
}