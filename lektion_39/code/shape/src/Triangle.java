public class Triangle extends Shape {

    double a; // dlina stoponi treugolnika
    double h; // visota, provedionaia k osnovaniu

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    public double sguare (){
        return (a*h)/2; }
}
