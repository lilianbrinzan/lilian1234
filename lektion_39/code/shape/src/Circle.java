public class Circle extends Shape{

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double sguare() {
        return Math.PI*radius*radius;
    }
}
