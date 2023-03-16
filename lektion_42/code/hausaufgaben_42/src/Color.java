public class Color extends Car {

    String color;

    public Color(String name, String engine, String color) {
        super(name, engine);
        this.color = color;
    }

    //Попытка "переопределения" статического метода
    public static void staticMethod(){
           System.out.println("Color: внутри статического метода");
    }

      // переопределение не статического метода
    @Override
    public void notStaticMethod() {
          System.out.println("Color: внутри не статического метода");
    }

    public static void staticPaint(){
        System.out.println("Paint: внутри статического метода" );
    }

    public void notStaticPaint(){
        System.out.println("Paint: внутри статического метода" );
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
