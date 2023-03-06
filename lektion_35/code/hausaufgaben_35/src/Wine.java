public class Wine {

    String name;
    String sort;
    int year;

    @Override
    public String toString() {
        return "Wine " +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                ' ';
    }
}
