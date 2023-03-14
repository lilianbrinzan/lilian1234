public class Programmer extends Human {

    // konstructor
    public Programmer(String firstName, String lastName) {

        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Programis liubit pisat cod");
        doCode();
    }

    public void doCode(){
        System.out.println("Cidim za klaviaturi");

    }

}
