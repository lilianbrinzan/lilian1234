public class Programmer extends Human {
    public int experience;

    public Programmer(int age, boolean isWorker, int experience) {
        super(age, isWorker);
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Programmer that = (Programmer) obj;
        return this.age == that.age && this.isWorker == that.isWorker
                && this.experience == that.experience;
    }

}
