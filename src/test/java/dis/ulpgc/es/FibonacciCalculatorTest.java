package dis.ulpgc.es;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciCalculatorTest {
    FibonacciCalculator fibonacciCalculator;
    @Before
    public void setup(){
        fibonacciCalculator = new FibonacciCalculator();
    }

    @Test
    public void return_fibonacci_of_a_number(){
        assertTrue(0==fibonacciCalculator.getFibonacci(0));
        assertTrue(1==fibonacciCalculator.getFibonacci(1));
        assertTrue(1==fibonacciCalculator.getFibonacci(2));
        assertTrue(2==fibonacciCalculator.getFibonacci(3));
        assertTrue(3==fibonacciCalculator.getFibonacci(4));
        assertTrue(5==fibonacciCalculator.getFibonacci(5));
        assertTrue(8==fibonacciCalculator.getFibonacci(6));
    }
}
