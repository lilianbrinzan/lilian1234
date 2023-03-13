public class Main {
    public static void main(String[] args) {

        System.out.println("Ploseadi figur");

        // krug
        double r = 10;
        Circle o1 = new Circle( "circle",r);
        double s_circle = o1.sguare(); // folosiv metod Class

        System.out.println("Ploseadi kruga " + s_circle);

        // treugolnik
        double a = 100;
        double h = 200;
        Triangle t1 = new Triangle("triangle", a, h);
        double s_triangle = t1.sguare();
        System.out.println("Ploscheadi triugolnika " + s_triangle);


    }
}