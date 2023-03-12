/**
 * Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
 *
 * Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
 * Автобус за день совершает 5 рейсов по маршруту.
 * Рассчитайте объем дневной выручки от работы автобуса.
 */

public class Passenger {
    String namePassenger;
    int jahrePassenger;

    public Passenger(String namePassenger, int jahrePassenger) {
        this.namePassenger = namePassenger;
        this.jahrePassenger = jahrePassenger;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "namePassenger='" + namePassenger + '\'' +
                ", jahrePassenger=" + jahrePassenger +
                '}';
    }
}
