public class Car {
    int age;
    String usage;
    int speed;

    // konstruktor
    public Car(int age, String usage, int speed) {
        this.age = age;
        this.usage = usage;
        this.speed = speed;
    }

    // metod, kotorii otrpavleait mashinu iezdeti
    public void work (){

        System.out.println("Mashina viehala");
    }

    public void go(){
        System.out.println("Car ist in die Strasse");
        this.speed = speed;

    }
    public void stop(){
        System.out.println("ich mache Stop");
        speed = 0;
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
