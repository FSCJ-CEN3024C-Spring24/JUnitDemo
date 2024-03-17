package edu.fscj.cen3024c;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    protected static Calculator calculator;

    @BeforeAll
    static void setUpAll() {
        calculator = new Calculator();
        System.out.println("Starting all tests");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Completed all tests");
    }

    @BeforeEach
    void setUp(TestInfo testInfo) {
        String methodName = testInfo.getTestMethod().map(Method::getName).orElse("unknown");
        System.out.println("Starting " + methodName);
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        String methodName = testInfo.getTestMethod().map(Method::getName).orElse("unknown");
        System.out.println("Finished " + methodName);
    }

    @Test
    void testSubtract() {
        double result = calculator.subtract(23, 10);
        assertEquals(13, result, "testSubtract failure");
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(23, 10);
        assertEquals(230, result, "testMultiply failure");
    }
}
