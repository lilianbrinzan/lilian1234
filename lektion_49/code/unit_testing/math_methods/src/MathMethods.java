public class MathMethods {

    // переменные (поля) класса не нужны
    // конструктор не нужен
    // в классе будут только его методы MathMethod.имяМетода()

    // - Проверка, что число простое
    public boolean isPrimeNumber(int number) throws IncorrectNumberInput {

        // 0, 1, -1 - эти числа не являются простыми и не должны попадать в метод
        if (number == 0 || number == 1 || number < 0) {
            throw new IncorrectNumberInput();
        }

        //   перебираем 2, 3, 4, 5, ... , number - 1 b проверяем делится ли number без остатка
        // если хоть раз разделилось без остатка (остаток == 0), но ЭТО НЕ ПРОСТОЕ число
        // иначе - ЭТО ПРОСТОЕ число
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // это значит нашелся делитель и число НЕ ПРОСТОЕ
            }
        }
        return true;
    }

    // - Проверка, что число четное

    public boolean isEven(int number) {
        if (number % 2 == 0) {return true;} else
            return false;
    }


    /**
     * // - Проверка, что число простое
     *     public boolean isPrimeNumber( int number) {
     *         //   перебираем 2, 3, 4, 5, ... , number - 1 b проверяем делится ли number без остатка
     *         // если хоть раз разделилось без остатка (остаток == 0), но ЭТО НЕ ПРОСТОЕ число
     *         // иначе - ЭТО ПРОСТОЕ число
     *
     *         //boolean isPrime = true;
     *
     *         for (int i = 2; i * i <= number; i++) {
     *             if ( number % i == 0){
     *                 return false;     // это значит нашелся делитель и число НЕ ПРОСТОЕ
     *             }
     *         }
     *         return true;
     *
     *     }
     *     // - Проверка, что число четное
     *     public boolean isEven ( int number){
     *         if (number % 2 == 0 ) {
     *             return true;
     *         } else {
     *             return false;
     *         }
     *     }
     *
     * @param number
     * @return
     */


    /**
     *
     *  for (int i = 2; i <= number; i++) {
     *             if (number % 2 == 0 ) {
     *                 return true;
     *             }
     *         }
     *         return false;
     *
     */

}
