public class Main {
    public static void main(String[] args) {
        System.out.println("Kontroli vozvrasta izbiratelea / na urovne konstructora Classa");
        System.out.println();

        Voter v1 = new Voter("123456789",15, "Willy");
        System.out.println(v1);
        System.out.println();
        Voter v2 = new Voter("987654321",35, "Jhon");
        System.out.println(v2);
        System.out.println();
        Voter v3 = new Voter("",47, "");




    }
}