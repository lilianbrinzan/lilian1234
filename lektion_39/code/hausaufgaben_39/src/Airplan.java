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
public class Airplan {
    private int airplan_line; // номер маршрута
    public Pilot pilot; // Pilot взят из класса Pilot
    int capacity; // вместимость
    int speed; // скорость аirplan
    int price; // стоимость проезда

    // конструктор аirplan
    public Airplan(int airplan_line, int capacity, int speed, int price) {
        this.airplan_line = airplan_line;
        this.capacity = capacity;
        this.speed = speed;
        this.price = price;
    }

    // сеттер назначает pilota для класса Airplan из класса Pilot
    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    // метод, который связывает аirplan и pilota
    public void go() {
        System.out.println("Аirplan " + this.airplan_line + " поехал под управлением - " + pilot.getName());
    }

    public Pilot getPilot() {
        return pilot;
    }

    @Override
    public String toString() {
        return "Информация об airplan: " + "\n" +
                "Номер маршрута: " + airplan_line + "\n" +
                "Вместимость: " + capacity + " кресел " + "\n" +
                "Pilot: " + getPilot().name + "\n" +
                "Скорость на маршруте: " + speed  +  ". ";

    }

}