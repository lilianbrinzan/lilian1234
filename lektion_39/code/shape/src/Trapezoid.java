public class Trapezoid extends Shape{
    double width1;
    double width2;
    double height;

    public Trapezoid(String name, double width1, double width2, double height) {
        super(name);
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }

    public double square() {
        return (width1 + width2) * height / 2;
    }
}