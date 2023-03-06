public class Main {
    public static void main(String[] args) {

        System.out.println("Example");

        class Car {
            String brand;
            String color;
            int year;
            String type;

        }

        Car myCar = new Car() ;
        myCar.brand = "VW";
        myCar.color = "silver";
        myCar.type = "universal";
        myCar.year = 2018;

       // System.out.println("Mark auto: " +  myCar.brand + "color" +myCar.color + " jear" + myCar.year);

        Pet myPet = new Pet();
        myPet.type = "cat";
        myPet.bread = "Mitadomestica";
        myPet.name = "Vasilika";
        myPet.weight = 4.5;

        System.out.println("Tip " + myPet.type + "Poroda " + myPet.bread + " nume " + myPet.name + " ves " + myPet.weight );
        System.out.println();
        System.out.println(myPet.toString());

    }
}
