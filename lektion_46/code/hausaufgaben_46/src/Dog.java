public class Dog {

    String name;
    int year; // это - поле ключ

    public Dog(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString() {
        return this.year + " " + this.name;
    }
}
