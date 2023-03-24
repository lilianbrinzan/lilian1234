public class Fruit implements Comparable<Fruit>{
    String name;
    int cod;
    int weiht;
    public Fruit(String name, int cod, int weiht) {
        this.name = name;
        this.cod = cod;
        this.weiht = weiht;
    }
    @Override
    public String toString() {
        return "\nFruit{" +
                "name='" + name + '\'' +
                ", cod=" + cod +
                ", weiht=" + weiht +
                '}';
    }

    public int compareTo(Fruit anotherFruit){
        return Double.compare(this.cod, anotherFruit.cod);
    }

    /**
     * // lucreaza cu cod in int
     *
     * @Override
     *     public int compareTo(Fruit anotherFruit) {
     *         if (this.cod == anotherFruit.cod){
     *             // условие сравнения по Fruit, это математическое сранение целых чисел
     *             return 0; // возвращаем 0, если равны
     *         } else if (this.cod < anotherFruit.cod){
     *             return -1; // возвращаем -1, если ...
     *         } else {
     *             return 1; // возвращаем + 1, если ...
     *         }
     *     }
     *
     */

    /**
     *  // lucreaza cu numele in String
     *
     * public int compareTo(Fruit anotherFruit){
     *         return CharSequence.compare(this.name, anotherFruit.name);
     *
     *     }
     *
     */

    /**
     * // lucreaza cu greutatea in int
     *
     * public int compareTo(Fruit anotherFruit){
     *         return Double.compare(this.weiht, anotherFruit.weiht);
     *
     *     }
     */


}
