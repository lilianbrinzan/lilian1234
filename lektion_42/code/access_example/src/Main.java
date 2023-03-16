public class Main {
    public static void main(String[] args) {

        System.out.println("Dostup k poleam Klassa (modifikator public, private....)");

        Person person = new Person("Kate", 32, "Baker Street","+1234567");

        person.displayName();
        person.displayAge();
        person.displayPhone();


    }
}