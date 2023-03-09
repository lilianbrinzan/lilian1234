public class Main {
    public static void main(String[] args) {
        System.out.println("Rabotnik und zarplata");


        Salary s1 = new Salary(" Ivanov Petr", " ivanov_p@mail.com", 101, 60000);
        Salary s2 = new Salary(" Petrov Alexei", " petrov_a@mail.com", 102, 48000);
/**
 *System.out.println(s1);
 *System.out.println(s2);
 *
 */
        System.out.println("vizivaiem metod mailPlaySlip");

        s1.mailPlaySlip();
        System.out.println();
        s2.mailPlaySlip();

        s2.setSalary(54000);
        System.out.println();
        s2.mailPlaySlip();

    }
}