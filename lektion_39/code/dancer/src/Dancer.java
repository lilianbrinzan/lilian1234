import java.security.SecureRandom;
public abstract class Dancer {

    String name;
    int age;
    String sex;

    public void dance () {

        System.out.println( toString() + "dvigatsea pod muziku");
    }

    // konstruktor
    public Dancer(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }


}
