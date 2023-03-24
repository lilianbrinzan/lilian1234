import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Здача 1. Пример класса Dog - сделать так,
        // чтобы ожно было отсортировать элементы класса (собачки) по годам.

        System.out.println("Hasaufgaben 46 output");

        // Делаем сортировку класса Dog по его полям
        System.out.println("Сортируем Sobak (объекты класса Dog )");

        ArrayList<Dog> dogList = new ArrayList<Dog>();

        // создаем объекты и кладем их в ArrayList

        dogList.add(new Dog("Шегги", 20));
        dogList.add(new Dog("Бобик", 5));
        dogList.add(new Dog("Роджер", 11));
        dogList.add(new Dog("Альма", 8));
        dogList.add(new Dog("Тамми", 18));

        Collections.sort(dogList, new SortbyYear());
        // вызываем метод sort для коллекции

        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }
        System.out.println("Sorted data according to Dog year");
        System.out.println("///////////////");
        // печатаем


        Collections.sort(dogList, new SortbyName());
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }
        System.out.println("Sorted data according to Dog name");


    }
}