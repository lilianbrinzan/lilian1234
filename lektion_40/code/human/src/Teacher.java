public class Teacher extends Human{

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Uciti i obeasneati");
        study();

    }

    public void study(){
        System.out.println("Ucimsea");
    }

}
