public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение для класса Money");

        Money m1 = new Money (1000, "usd");
        m1.toString();
        System.out.println(m1);

        // sosdati esheo elementi (objekt) Klassa Money
        // pridumati primer, kogda mi kakie-to denghi sravnevaem s kakie-to drugimi dengami

        Money m2 = new Money(1000, "eur");
        m2.toString();
        System.out.println(m1.equals(m2));

        Money m3 = new Money(1000, "usd");
        m3.toString();
        System.out.println(m1.equals(m3));
        // System.out.println(m3.equals(m1));


        // Tema pentru acasa
        /**
         *Money m2 = new Money(1000, "eur");
         *         Money m3 = new Money(1000, "usd");
         *
         *
         *
         *         System.out.println( m1.equals(m3));
         *
         */





    }
}