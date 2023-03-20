public class Main {
    public static void main(String[] args) {

        System.out.println("Ploseadi figur");

        // krug
        double r = 10;
        Circle o1 = new Circle( "circle",r);
        double s_circle = o1.sguare(); // folosiv metod Class
        System.out.println("Ploseadi kruga " + s_circle);

        // treugolnik
        double a = 10;
        double h = 5;
        Triangle r1 = new Triangle("triangle", a, h);
        double p = r1.sguare();
        System.out.println("Ploscheadi triugolnika " + p);

        //
        Trapezoid t1 = new Trapezoid("Трапеция", 10, 5, 5);
        double t = t1.sguare();
        System.out.println("Площадь трапеции: " + t);


    }
}