/*
- задача об автобусе:
Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
(не может быть больше 60 км/ч), стоимость проезда 2 евро.
В классе Bus создайте метод setDriver,
который принимает имя драйвера и назначает его водителем автобуса.
Сформируйте информцию об автобусе в следующем виде:
  Информация об автобусе:
  Номер маршрутв : __
  Вместимость: ___ кресел
  Водитель: _____
  Скорость на маршруте: _____
 */
public class Bus {
    int bus_line; // номер маршрута
    String driver; // водитель
    int capacity; // вместимость
    int speed; // скорость автобуса
    int price; // стоимость проезда

    public Bus(int bus_line, String driver, int capacity, int speed, int price) {
        this.bus_line = bus_line;
        this.driver = driver;
        this.capacity = 36;
        if (speed <= 60) {
            this.speed = speed;
        } else {
            System.out.println("Автобус с очень высокой скоростью, это небезопасно!");
        }

        this.price = price;
    }


}