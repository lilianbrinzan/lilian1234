public class Main {
    public static void main(String[] args) {

        System.out.println("Rabotnik und Address");

        Address s1 = new Address("Elena Juraveli","Stollenstr.12A",101,"Baselstr.67");
        Address s2 = new Address("Tatiana Marian","Eisenbahnstr.78",102,"Maierstr.45");


        //System.out.println("vizivaiem metod mailPlaySlip");

        s1.mailPlaySlip();
        System.out.println();
        s2.mailPlaySlip();







    }
}