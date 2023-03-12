/**
 * - задача об автобусе:
 * Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
 * (не может быть больше 60 км/ч), стоимость проезда 2 евро.
 *
 * В классе Bus создайте метод setDriver,
 * который принимает имя драйвера и назначает его водителем автобуса.
 *
 * Сформируйте информцию об автобусе в следующем виде:
 *   Информация об автобусе:
 *   Номер маршрутв : __
 *   Вместимость: ___ кресел
 *   Водитель: _____
 *   Скорость на маршруте: _____
 */

public abstract class Bus{
    int bus_line; // номер маршрута
    String driver; // водитель
    int capacity; // вместимость
    int speed; // скорость автобуса
    int price; // стоимость проезда

    // konstruktor
    public Bus(int bus_line, String driver, int capacity, int speed, int price) {
        this.bus_line = bus_line;
        this.driver = driver;
        this.capacity = 36;
        if (speed <= 60) {
            this.speed = speed;
          } else {
             System.out.println("Автобус с очень высокой скоростью, это небезопасно!");
          }
        if (price >= 2) {
            this.price = price;
              System.out.println("Esli zaplatili bolishe cem 2 euro na 1 person, to Vam dadut zdaciu");
          } else {
              System.out.println("Автобус очень dorogoi dlea Vas !!!");
              System.out.println("Sie haben kein Geld?");
              System.out.println("Sie sind behindert?");
          }
    }
    // setter
    public void setDriver(String driver) {
        this.driver = driver;
        System.out.println("Uvajaemii" + this.driver + "vi sofer avtobusa" + this.bus_line);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bus_line=" + bus_line +
                ", driver='" + driver + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                '}';
    }



}


