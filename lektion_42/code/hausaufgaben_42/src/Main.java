public class Main {
    public static void main(String[] args) {
        // Hausaufgaben 42

        Car car1 = new Car("Jaguar", "V8");
        Car car2 = new Car("Bugatti", "W16");

        System.out.println("Результат: " + Car.numberOfCars);

        car1.staticMethod();
        car2.staticMethod();

        System.out.println();

        car1.notStaticMethod();
        car2.notStaticMethod();


    }
}