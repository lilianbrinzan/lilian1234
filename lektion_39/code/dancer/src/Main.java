import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primer nasledovania s Class Dancer !!");

        TwistDancer d2 = new TwistDancer( "Tanzor Twista", 27, "M");
        d2.dance();

        BreakDancer d3 = new BreakDancer( "Tanzor Break-danser", 26, "F");
        d3.dance();

        DancerClassik d4 = new DancerClassik("Tanzor Petea", 35, "M");
        d4.dance();

        List<Dancer> dansers_List = new ArrayList<>();
        dansers_List.add(d2);
        dansers_List.add(d3);
        dansers_List.add(d4);
        System.out.println(dansers_List);

        for (int i = 0; i < dansers_List.size(); i++) {

            System.out.println(dansers_List.get(i));
        }

    }
}