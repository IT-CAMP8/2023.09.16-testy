package pl.camp.it.testy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

//@ExtendWith(BeforeAllTestsClass.class)
public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Kostruktor klasy testujacej !!!");
    }

    @BeforeAll
    public static void prepareForAll() {
        System.out.println("Przygotowanie przed wszystkimi testami !!!");
        CalculatorTest.calculator = new Calculator();
    }

    @BeforeEach
    public void prepare() {
        System.out.println("przygotowanie do testu !!!");
    }

    @AfterEach
    public void clean() {
        System.out.println("sprzatanie po tescie !!!");
    }

    @AfterAll
    public static void cleaAfterAllTests() {
        System.out.println("sprzatanie po wszystkich testach !!!");
    }

    @Test
    void addTwoPositivesTest() {
        int a = 5;
        int b = 7;
        int expected = 12;

        int actual = CalculatorTest.calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTwoNegativesTest() {
        int a = -4;
        int b = -4;
        int expected = -8;

        int actual = CalculatorTest.calculator.add(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 8;
        int b = 4;
        double expected = 2.0;

        double actual = CalculatorTest.calculator.divide(a,b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideTwoPositivesWithDecimalResultTest() {
        int a = 9;
        int b = 2;
        double expected = 4.5;

        double actual = CalculatorTest.calculator.divide(a, b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideByZeroTest() {
        int a = 9;
        int b = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> CalculatorTest.calculator.divide(a,b));
    }
}
