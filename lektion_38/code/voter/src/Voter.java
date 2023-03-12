public class Voter {

    String ID_num;
    int age;
    String name;

    public Voter(String ID_num, int age, String name) {
        this.ID_num = ID_num;
        if (age >= 16 ) {
            this.age = age;
            System.out.println("Izberateli mojet ");
        } else {
            this.age = age;
            System.out.println("Izberateli ne mojet ");
        }
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Izberateli ..... ");
        }

    }

    @Override
    public String toString() {
        return "Voter{" +
                "ID_num='" + ID_num + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
