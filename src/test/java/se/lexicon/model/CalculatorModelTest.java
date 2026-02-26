package se.lexicon.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {

    @Test
    void testAddition() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(5);
        model.setOperator('+');

        assertEquals(15, model.calculate());
    }

    @Test
    void testSubtraction() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(5);
        model.setOperator('-');

        assertEquals(5, model.calculate());
    }

    @Test
    void testMultiplication() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(5);
        model.setOperator('*');

        assertEquals(50, model.calculate());
    }

    @Test
    void testDivision() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(5);
        model.setOperator('/');

        assertEquals(2, model.calculate());
    }

    @Test
    void testDivideByZero() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(0);
        model.setOperator('/');

        assertThrows(ArithmeticException.class, model::calculate);
    }

    @Test
    void testInvalidOperator() {
        CalculatorModel model = new CalculatorModel();
        model.setNum1(10);
        model.setNum2(5);
        model.setOperator('%');

        assertThrows(IllegalStateException.class, model::calculate);
    }
}
