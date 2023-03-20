import java.util.ArrayList;

public class Category {
    //  Создать класс Категория, имеющий переменные имя и массив товаров.

    Product product; // product, v котором vhodit Category
    String name; // наименование категории
    ArrayList products; // массив товаров

    // конструктор класса
    public Category(String name, ArrayList products) {
        this.name = name;
        this.products = products;
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
    }  // ramine

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}