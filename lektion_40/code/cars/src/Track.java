public class Track extends Car{

    String brand;
    int load_weight;

    // konstruktor

    public Track(int age, String usage, int speed, String brand, int load_weight) {
        super(age, usage, speed);
        this.brand = brand;
        this.load_weight = load_weight;
    }

    public void work() {
        System.out.println("Track arbeiten in Land");
        study();

    }
    public void study(){
        System.out.println("Track ...");
    }

    public void stop() {
        System.out.println("Track остановился");
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
