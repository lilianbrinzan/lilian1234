public class Main {
    public static void main(String[] args) {
        // Hausaufgaben 39
        System.out.println("Zadacha pro Airplan and Pilot");
        /**
         * Задача об Airplan:
         * Создать класс Airplan с атрибутами: номер маршрута, Pilot, вместимость 50 мест,
         * скорость на маршруте(не может быть больше 700 км/ч), стоимость проезда 100 евро.
         *
         * В классе аirplan создайте метод setPilot, который принимает имя драйвера и назначает его pilota airplan.
         * Сформируйте информцию об аirplan в следующем виде:
         * Информация об аirplan:
         * Номер маршрутa : __
         * Вместимость: ___кресел
         * Pilot: _____
         * Скорость на маршруте: _____
         *
         * Создать класс Pilot с атрибутами:
         * имя Pilota, возраст Pilota (должен быть старшше 21 года и не старше 65 лет).
         *
         *
         *
         */


        // Создаём аirplan
        Airplan airplan1 = new Airplan( 1, 50, 700, 100);

        // Создаем pilot
        Pilot d1 = new Pilot("Schumaher Alex", 25);

        // назначаем pilota на аirplan
        d1.go(airplan1);
        System.out.println("Pilot airplana: " + airplan1.getPilot().name);

        System.out.println();
        // печатаем информацию о маршруте
        System.out.println(airplan1);




    }
}