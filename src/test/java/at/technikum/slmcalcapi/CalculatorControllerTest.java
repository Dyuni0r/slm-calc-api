package at.technikum.slmcalcapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorControllerTest {
    @Test
    void SumTest1(){
        CalculatorController calculatorController = new CalculatorController();

        int a = 0, b = 3;

        int res = calculatorController.sum(a, b);
        assertEquals(3, res);
    }

    @Test
    void sumTest2() {
        CalculatorController calculatorController
                = new CalculatorController();

        assertEquals(-8, calculatorController.sum(-2, -6));
    }

    @Test
    void sumTest3() {
        CalculatorController calculatorController
                = new CalculatorController();

        assertEquals(4, calculatorController.sum(-2, 6));
    }
}
