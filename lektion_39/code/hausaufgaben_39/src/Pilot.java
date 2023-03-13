public class Pilot {
    String name;
    int age;
    Airplan airplan; // Airplan, на котором ездит Pilot

    // конструктор с контролем
    public Pilot(String name, int age) {
        this.name = name;
        if (age >= 21 && age <= 65) {
            this.age = age;
            System.out.println("Pilot допущен у правлению airplan");
        } else {
            System.out.println("Pilot не допущен у правлению airplan");
        }
    }

    public String getName() {
        return name;
    }

    // метод, который сажает Pilota на Airplan
    public void go(Airplan airplan) {
        this.airplan = airplan;
        this.airplan.setPilot(this);
    }

    // метод, который отображает, что pilot поехал на Airplan
    public void pilot() {
        this.airplan.go();  // вызываем метод из класса Airplan
    }

    public int getAge() {
        return age;
    }

}