public class Programmer extends Human{
    public int experience; // открытое поле, отражает кол-во лет опыта програмиста

    public Programmer(int age, boolean is_worker, int experience) {
        super(age, is_worker);
        this.experience = experience;
    }
}
