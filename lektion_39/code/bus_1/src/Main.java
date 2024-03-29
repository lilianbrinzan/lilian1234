public class Main {
    public static void main(String[] args) {
        System.out.println("Задача про автобус.");
        /**
         * Задача об автобусе:
         * Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест,
         * скорость на маршруте(не может быть больше 60 км/ч), стоимость проезда 2 евро.
         *
         * В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает его водителем автобуса.
         * Сформируйте информцию об автобусе в следующем виде:
         *   Информация об автобусе:
         *       Номер маршрутв : __
         *       Вместимость: ___кресел
         *       Водитель: _____
         *       Скорость на маршруте: _____
         *
         * Создать класс Driver с атрибутами:
         * имя водителя, возраст водителя (должен быть старшше 21 года и не старше 65 лет).
         *
         * Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
         *
         * Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
         * Автобус за день совершает 5 рейсов по маршруту.
         * Рассчитайте объем дневной выручки от работы автобуса.
         *
         */

        // Создаём автобус
        Bus bus1 = new Bus( 1, 36, 60, 2);

        // Создаем водителя
        Driver d1 = new Driver("Водила Водилов", 25);

        // назначаем водителя на автобус
        d1.go(bus1);
        System.out.println("Водитель автобуса: " + bus1.getDriver().name);

        System.out.println();
        // печатаем информацию о маршруте
        System.out.println(bus1);



        // рассчет потенциальной выручки
        int revenue = 0;
        revenue = (int)(0.6 * bus1.capacity) * 5 * bus1.price;

        System.out.println("Потенциальная дневная выручка: " + revenue);

    }
}