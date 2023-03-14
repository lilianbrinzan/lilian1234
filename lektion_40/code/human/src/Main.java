public class Main {
    public static void main(String[] args) {

        System.out.println("Celovek i profesia");

        Human human = new Human ( "Alexander", "Alexanderov");
        Programmer programmer = new Programmer("Kianu","Riva");
        Teacher teacher = new Teacher("Maria", "Evdokimova");
        Sportsman sportsman = new Sportsman("Razil", "Miniahmetov");

        human.work();
        programmer.work();
        teacher.work();
        sportsman.work();

        Human human1 = programmer;
        Human human2 = teacher;
        Human human3 = sportsman;

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human1.work();
        human2.work();
        human3.work();






    }
}