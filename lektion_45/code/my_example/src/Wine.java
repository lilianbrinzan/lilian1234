public class Wine implements Comparable<Wine> {

    int number;
    int price;
    String name;

    public Wine(int number, int price, String name) {
        this.number = number;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    // compareTo
    //...
    @Override
    public int compareTo(Wine anotherWine){
        if (this.price == anotherWine.price){
            return 0;
        } else if (this.price < anotherWine.price){
            return -1;
        } else {
            return 1;
        }

    }
    /**
     *
     *
     */
}
