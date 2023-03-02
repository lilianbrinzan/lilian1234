 import java.util.ArrayList;
 import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
      // Создадим список марок автомобилей
        ArrayList<String> brandList = new ArrayList<String>();

        brandList.add("BMW");
        brandList.add("Mercedes");
        brandList.add("VW");
        brandList.add("Ford");
        brandList.add("Fiat");
        brandList.add("Opel");

        System.out.println(brandList); // "грубая" распечатка содержимого

        int size = brandList.size(); // узнаем размер листа
        System.out.println("Рамер листа, который создали: " + size);

        int index = brandList.indexOf("Fiat");
        System.out.println("Номер " + "Fiat" + " в списке " + index );

        brandList.remove(4 ); // eдаляем 4-й номер из листа
        System.out.println(brandList); // печать после удаления

        boolean BrandPresents = brandList.contains("Opel"); // проверка на наличие
        System.out.println(BrandPresents);


        // проверяем, что объект ест в списке и тогда он не добавляется
        if (brandList.contains("Opel") == false) {
            brandList.add("Opel");
        }
        System.out.println(brandList);

        // добавим отсутствующий бренд в список, если его нет в списке
        if (brandList.contains("Audi") == false) {
            brandList.add("Audi");
        }
        System.out.println(brandList);

        // распечатка листа c индексами
        for (int i=0; i < brandList.size(); i++) {
            System.out.println(i + " " + brandList.get(i));
        }

        System.out.println();

        // Сортировка листа
        Collections.sort(brandList); // вызов алгоритма сортировки
        System.out.println(brandList);

        for (int i=0; i < brandList.size(); i++) {
            System.out.println(i + " " + brandList.get(i));
        }
    }
}