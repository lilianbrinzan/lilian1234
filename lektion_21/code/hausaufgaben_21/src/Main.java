public class Main {
    public static void main(String[] args) {


        //System.out.println("Привет Cogort23.2!");
        // PЗадача о поиске минимального и максимального элемента массива
        // Зададим массив случайных целых чисел от 1 до 10
        // Реализовать метод поиска max из чисел в массиве и min
        // Распечатать массив, min и max

        // Lektion 21 Hausaufgaben 1

        int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int)(( Math.random() * (10 - 1 + 1) + 1));
            System.out.println("Задуманный маасив :" + arrayIntRandom[i]);
        }
        int minimum_array = min (arrayIntRandom);
        System.out.println("Мinimalnii элемент массива равен: " + minimum_array);

        int maximum_array = max (arrayIntRandom);
        System.out.println("Мaximalnii элемент массива равен: " + maximum_array);

    }

    public static int min(int array[]) {
        int minimum = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int max(int array[]) {
        int maximum = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
    // перебираем значения массива и каждое сравниваем с текущим minimum
    // если значение меньше minimum, то minimum = найденному значению массива

    //System.out.println("Hello world!");
}
