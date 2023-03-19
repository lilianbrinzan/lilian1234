public class Product {

    // Создать класс Товар, имеющий переменные имя, цена, рейтинг.
    static final String platform1 = "Kaberne";
    static final String platform2 = "Schardone";
    public Category category; // category взят из класса Category
    String name_product;
    double price;
    int rating;

    public Product(String name_product, double price, int rating) {
        this.name_product = name_product;
        this.price = price;
        this.rating = rating;
    }

    // сеттер назначает category для класса Product из класса Category
    public void setCategory(Category category){
        this.category = category;

    }

    // метод, который связывает name_product и category
    public void go (){
        System.out.println("Product " + this.name_product+ " вошёл в - " + category.getName());
    }

    public Category getCategory() {
        return category;
    }
    ///

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name_product='" + name_product + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(product.price, price) != 0) return false;
        return name_product.equals(product.name_product);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name_product.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
