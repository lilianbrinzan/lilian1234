public class Auto extends Car{

    int capacity;

    public Auto(int age, String color, int capacity) {
        super(age, color);
        this.capacity = capacity;
    }

    /**
     *
     * @Override
     *     public void paint() {
     *         super.paint();
     *         System.out.println("Krasim na konveere ");
     *     }
     */


    @Override
    public String toString() {
        return "Auto{" +
                "capacity= " + capacity +
                ", age= " + age +
                ", color= '" + color + '\'' +
                " Platform= " + platform +
                '}';
    }
}
