public class Main {
    public static void main(String[] args) {

        System.out.println("Prakticum");

        Phone phone1 = new Phone("+7 903 123 45 67",  "Samsung", "A5" );
        Phone phone2 = new Phone("+49 152 666 777",  "Nokia", "iPhone 11");


        System.out.println(phone1);
        System.out.println(phone2);


      /* Phone myPhone1 = new Phone ();
        myPhone1.phoneNumber = "+7 903 123 45 67";
        myPhone1.brand = "Samsung";
        myPhone1.model = "A5";

        Phone myPhone2 = new Phone ();
        myPhone2.phoneNumber = "+49 152 666 777";
        myPhone2.brand = "Nokia";
        myPhone2.model = "iPhone 11";

        Phone myPhone3 = new Phone ();
        myPhone3.phoneNumber = "+49 152 123 456";
        myPhone3.brand = "Apple";
        myPhone3.model = "iPhone 10";

        System.out.println(myPhone1.toString());
        System.out.println(myPhone2.toString());
        System.out.println(myPhone3.toString());

        myPhone1.receiveCall( "Moi prieateli");

        System.out.println(" Nummber 1 Phone " + myPhone1.getPhoneNumber());
        System.out.println(" Nummber 2 Phone " + myPhone2.getPhoneNumber());
        System.out.println(" Nummber 3 Phone" + myPhone3.getPhoneNumber());

      */

    }
}