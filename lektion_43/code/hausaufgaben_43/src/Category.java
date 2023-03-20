public class Category {
    // Создать класс Категория, имеющий переменные имя и массив товаров.
    //         * Создать несколько объектов класса Категория.

    Product product; // product, v котором vhodit Category

    String name;

    int capacity;

    public Category(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
    }


    public void go(Product product){
        this.product = product;
        this.product.setCategory(this);
    }
    public void category() {
        this.product.go(); // вызываем метод из класса Product
    }
    //////////////////////////////////////////////////////////////////////////77

    public String getName() {
        return name;
    }  // ramine


    ////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
