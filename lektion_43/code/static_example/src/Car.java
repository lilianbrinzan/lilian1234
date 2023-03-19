public class Car {

    static final String platform = "Number one";
    int age; // это возраст
    static String color; // это цвет

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public static void paint() {
        System.out.println("Автомобиль покрашен в..." + color + " цвет.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                " Platform= " + platform +
                '}';
    }
}
