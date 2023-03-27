import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;

public class MathMethodsTest {
    MathMethods mathMethods;   // подключили тестируемый класс

    @BeforeEach
    void setUp() {
        mathMethods  = new MathMethods(); // создаем экземпляр тестируемого класса перед каждым тестом

    }

    @Test
    @DisplayName("Тестируем метод isPrime ")
    void testIsPrime(){
        assertTrue(mathMethods.isPrimeNumber(23)); // ожидаю true при числе 13
        assertFalse(mathMethods.isPrimeNumber(121)); // ожидаю false при числе 121
        assertTrue(mathMethods.isPrimeNumber(31) );
        assertFalse(mathMethods.isPrimeNumber(45));

    }

    // ________________________________________________________________


    MathMethods mathMethods2;   // подключили тестируемый класс

    @BeforeEach
      void setUp2(){
       mathMethods2  = new MathMethods();
    }

    @Test
    @DisplayName("Тестируем метод isEven ")
    void isEven(){
        assertTrue(mathMethods2.isEven(10));
        assertFalse(mathMethods2.isEven(12));
        assertTrue(mathMethods2.isEven(31));
        assertFalse(mathMethods2.isEven(45));
    }


}
