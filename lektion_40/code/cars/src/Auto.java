public class Auto extends Car{

    String brand;
    int capacity;

    // konstructor Klassa
    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    public void work() {
        System.out.println("Auto ist schoon");
        doCode();
    }

    public void doCode(){
        System.out.println("Auto fahren schnell");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге всей семьей");
        this.speed = speed;
    }

    public void speed_up(){
        System.out.println("ich mache Meer");
        speed = speed + 10;
        System.out.println("Скорость выросла: " + speed);
    }
    public void speed_down(){
        System.out.println("ich mache vheniga=mensche");
        speed = speed - 10;
        System.out.println("Скорость упала: " + speed);
    }

}
