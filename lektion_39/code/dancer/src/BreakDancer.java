public class BreakDancer extends Dancer{

    //konstructor
    public BreakDancer(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "dvigatiza, kak starii robot");
        //super.dance();
    }
}
