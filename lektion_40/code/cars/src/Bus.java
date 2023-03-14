public class Bus extends Car {
    String brand;
    int seats;

    // konstructor
    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }
    public void work() {
        System.out.println("Bus ist in die Strasse");
        playFootball();

    }
    public void playFootball(){

        System.out.println("Bus ist ....");
    }

    // geter
    public String getBrand() {
        return brand;
    }
    // seter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // geter
    public int getSeats() {
        return seats;
    }
    // seter
    public void setSeats(int seats) {
        this.seats = seats;
    }


    public void stop(){
        System.out.println("Автобус остановился");
        speed = 0;
    }
    public void go(){
        System.out.println("Едем по дороге c пассажирами");
        this.speed = speed;
    }

    @Override
    public void speed_up() {
        System.out.println("ich mache Meer");
        speed = speed + 10;
        System.out.println("Скорость выросла: " + speed);

    }

    @Override
    public void speed_down() {
        System.out.println("ich mache vheniga=mensche");
        speed = speed - 10;
        System.out.println("Скорость упала: " + speed);
    }

}
