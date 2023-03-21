public class House implements Comparable<House>{
    int area;
    int price;
    String city;

    // konstruktor
    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    //pereopredelenia toString
    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }

    // compareTo
    //...
    @Override
    public int compareTo(House anotherHouse){
        if (this.price == anotherHouse.price){
            return 0;
        } else if (this.price < anotherHouse.price){
            return -1;
        } else {
            return 1;
        }

    }

}
