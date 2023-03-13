public class Passenger {
    String name;
    int age;

    public Passenger(String name, int age) {
        this.name = name;
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Пассажир слишком молод!");
        }

    }
}