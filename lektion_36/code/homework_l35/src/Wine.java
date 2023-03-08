public class Wine {
    String name;
    String sort;
    int year;

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';
    }

    public int onStock(int n) {
        System.out.println("Na sclade esti " + n + " butilchi");
        return n;
    }

    /**
     * public String onStock(int n) {
     *         return("Na sclade esti" + n + " butilchi");
     *     }
     *
     *
     */


    public int getYear() {
        return year;
    }
}
