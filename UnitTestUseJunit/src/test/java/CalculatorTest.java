import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        int a = 2, b = 3;
        assertEquals(calculator.add(a, b), 5);
    }

    @Test
    public void testDivide(){
        int a = 3, b = 0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });
    }
}
