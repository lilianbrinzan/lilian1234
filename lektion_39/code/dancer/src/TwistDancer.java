public class TwistDancer  extends Dancer {

    public TwistDancer(String name, int age, String sex) {
        super(name, age, sex); // eti polea is rodilescova classa
    }

    @Override
    public void dance() {
        System.out.println(toString() + "dvigatiza");
        // super.dance();
    }
}
