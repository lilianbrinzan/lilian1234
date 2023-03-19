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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    ////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;

        if (capacity != category.capacity) return false;
        return name.equals(category.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + capacity;
        return result;
    }

}
