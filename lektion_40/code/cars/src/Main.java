//import java.util.ArrayList;
//import java.util.List;

public class  Main {
    public static void main(String[] args) {
        System.out.println("Человек и профессиa");


        Car car = new Car(5, "Deutschland", 100);
        Bus bus = new Bus(4, "Job", 80,"seatre", 2);
        Auto auto = new Auto(3, "Weekend", 90, "S",4);
        Track track = new Track(2, "Agriculture", 60, "JohnDear", 5);

        car.work();
        bus.work();
        auto.work();
        track.work();

        car.go();
        car.stop();
        car.speed_down();
        car.speed_up();



        // это восходящее преобразование,
        // это пример создания экземпляров класса Car
        // не используется вызов конструктора , то есть new ...

        /**
         * Car car1 = bus;
         *         Car car2 = auto;
         *         Car car3 = track;
         *
         *         System.out.println(car1);
         *         System.out.println(car2);
         *         System.out.println(car3);
         *
         *         car1.work();
         *         car2.work();
         *         car3.work();
         */


    }
}