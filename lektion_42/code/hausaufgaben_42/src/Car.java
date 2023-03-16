public class Car {

    static int numberOfCars;
    String name;
    String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public static void staticMethod() {
        System.out.println("Car: внутри статического метода");
    }
    public void notStaticMethod() {
        System.out.println("Car: внутри не статического метода");
    }
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

}
