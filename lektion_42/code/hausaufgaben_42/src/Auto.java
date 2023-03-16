public class Auto extends Car{

    String brand;
    int capacity;

    public Auto(String name, String engine, String brand, int capacity) {
        super(name, engine);
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getCapacity() {

        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
