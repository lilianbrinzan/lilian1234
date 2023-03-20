public class Product {

    // Создать класс Товар, имеющий переменные имя, цена, рейтинг.

    static final String platform1 = "Kaberne";
    static final String platform2 = "Schardone";
    public Category category; // category взят из класса Category

    // ........

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


// toString

    @Override
    public String toString() {
        return "Product{" +
                "name_product='" + name_product + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

}
