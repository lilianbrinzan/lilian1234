public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Cogort23.2!");
        // PЗадача о поиске минимального и максимального элемента массива
        // Зададим массив случайных целых чисел от 1 до 10
        // Реализовать метод поиска max из чисел в массиве и min
        // Распечатать массив, min и max

        int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int)(( Math.random() * (10 - 1 + 1) + 1));
            // System.out.println("Задуманный маасив :" + arrayIntRandom[i]);
        }
        int min_array = min (arrayIntRandom);
        System.out.println("Минимальный элемент массива равен: " + min_array);
    }

    // перебираем значения массива и каждое сравниваем с текущим minimum
    // если значение меньше minimum, то minimum = найденному значению массива
    public static int min(int array[]) {
        int minimum = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}