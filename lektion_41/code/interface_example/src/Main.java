public class Main {
    public static void main(String[] args) {
        System.out.println("Primer interface i java");

        Vehicle vehicle = new Vehicle(); // create object
        vehicle.moveFast(); // use method from interface Move
        vehicle.moveSlow(); // use method from interface Move



    }
}