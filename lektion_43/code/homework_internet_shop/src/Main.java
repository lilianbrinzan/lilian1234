import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Homework 43
        System.out.println("Proba");

        Product p1 = new Product("Caberne", 10, 1);
        Product p2 = new Product("Schardone", 9, 2);
        Product p3 = new Product("Merlot", 8, 3);
        System.out.println("Categoria Vina: " + p1.name_product + " capacity " + p1.price);
        System.out.println();

        // это массив товаров
        ArrayList products =new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        System.out.println(products);

        // создаем несколько категорий товаров
        Category category1 = new Category("Wine", products);

        category1.go(p1);

        // печать категории товаров
        System.out.println(category1.name);

        // создаем корзину
        Basket b1 = new Basket(products);

        // создаем пользователей
        User u1 = new User("log1", "pass1", new Basket(products));
        System.out.println(u1);











    }
}