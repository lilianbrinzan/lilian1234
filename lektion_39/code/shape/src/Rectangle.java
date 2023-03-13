public class Rectangle extends Shape{
    double length; // длина
    double width; // ширина

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double square() {
        return length * width;
    }
}
