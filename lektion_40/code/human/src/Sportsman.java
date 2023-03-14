public class Sportsman  extends Human {

    public Sportsman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Nado idti na trenirovku");
        playFootball();

    }

    public void playFootball(){

        System.out.println("Begati s meaciom");
    }
}
