/**
 * Создать класс Driver с атрибутами: имя водителя, возраст водителя
 * (должен быть старшше 21 года и не старше 65 лет).
 */

public class Driver {
    String nameDriver;
    int jahreDriver;

    // Konstructor

    public Driver(String nameDriver, int jahreDriver) {
        this.nameDriver = nameDriver;
        this.jahreDriver = jahreDriver;
    }



    public String getNameDriver() {
        return nameDriver;
    }
    public int getJahreDriver() {
        return jahreDriver;
    }

    public void setJahreDriver(int newJahreDriver) {
       // this.jahreDriver = jahreDriver;
       if ( newJahreDriver > 21) {
           if ( newJahreDriver < 65 )
           jahreDriver = newJahreDriver;
           System.out.println("Driver ist ab 21 bis 65 jahre alt !!!");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", jahreDriver=" + jahreDriver +
                '}';
    }
}
