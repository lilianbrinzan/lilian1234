public class Main {
    public static void main(String[] args) {
        // Hausaufgaben 43
        System.out.println(" Internet Magazin.v 0.1");

        /****Интернет магазин, часть 1**
         * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
         *
         * Создать класс Категория, имеющий переменные имя и массив товаров.
         * Создать несколько объектов класса Категория.
         *
         * Создать класс Basket, содержащий массив купленных товаров.
         * Создать класс User, содержащий логин, пароль и объект класса Basket.
         * Создать несколько объектов класса User.
         *
         * Вывести на консоль каталог продуктов.
         * Вывести на консоль покупки посетителей магазина.
         */

        // Создаём product
        Product product1 = new Product("Wine", 10, 2);

        // Создаём category
        Category c1 = new Category("Caberne", 500);

        c1.go(product1);

        System.out.println("Categoria Vina: " + c1.name + " capacity" + c1.capacity );

        // печатаем информацию о Wine
        System.out.println(product1);






    }
}