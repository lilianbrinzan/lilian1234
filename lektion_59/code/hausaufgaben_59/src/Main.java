public class Main {
    public static void main(String[] args) {
        //System.out.println("Hausaufgaben 59");
        /**
         * Переписать
         * лямбда-выражения   для   интерфейсов
         *
         *   Checkable         =   Predicate <T>
         *   Printable         =   Consumer <T>
         *   Producable        =   Supplier <T>
         *   StringConcate     =   Function < T, R >
         *   Transformable     =   UnaryOperator < T >
         *
         * из домашнего задания и с урока на стандартных функциональных интерфейсах Java.
         */

    }
    // ___________________________________________________________________________

    public interface Function < T, R >{
        R apply (T ob);
        /**
         * public interface StringConcate {
         *     String concat ( int a, int b);
         *     }
         */
    }


// ___________________________________________________________________________
    public interface Predicate <T>{
       boolean test ( T ob );
    /**
     * public interface Checkable {
     *     boolean check(String in);
     *    }
     */
    }


// ___________________________________________________________________________

    public interface Consumer <T>{
       void accept ( T ob );
        /**
         * public interface Printable {
         *     void print (String s);
         *}
         */
    }


// ___________________________________________________________________________
    public interface Supplier <T>{
       T get ();
    /**
     * public interface Producable {
     *     String produce();
     *}
     */
    }

// ___________________________________________________________________________

    public interface UnaryOperator < T > {
        T apply ( T ob);
        /**
         * @FunctionalInterface
         * public interface Transformable {
         *     String modify (String in);
         *}
         */
    }




}