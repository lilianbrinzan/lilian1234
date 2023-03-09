public class Vet {
    String name;

    public Vet(String name) {
        this.name = name;
    }

    // treat = "lechiti" in rusa
    public void treatAnimal(Animal animal) {
        System.out.println("На прием пришла " + animal.name);
        // animal.makeNoise();
        animal.getDescription();
    }
}
