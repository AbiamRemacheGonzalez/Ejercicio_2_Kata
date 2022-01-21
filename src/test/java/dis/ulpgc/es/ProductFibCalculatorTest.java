package dis.ulpgc.es;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ProductFibCalculatorTest {
    ProductFibCalculator productFibCalculator;
    Integer[] PF_0;
    Integer[] PF_714;
    Integer[] PF_1870;
    Integer[] PF_1;
    Integer[] PF_800;
    @Before
    public void setup(){
        productFibCalculator = new ProductFibCalculator();
        PF_0 = new Integer[]{0,1,1};
        PF_1 = new Integer[]{1,1,1};
        PF_714 = new Integer[]{21,34,1};
        PF_714 = new Integer[]{21,34,1};
        PF_1870 = new Integer[]{34, 55, 1};
        PF_800 = new Integer[]{34, 55, 0};
    }

    @Test
    public void return_fibonacci_sequence_of_a_product(){
        assertArrayEquals(PF_0,productFibCalculator.productFib(0));
        assertArrayEquals(PF_1,productFibCalculator.productFib(1));
        assertArrayEquals(PF_714,productFibCalculator.productFib(714));
        assertArrayEquals(PF_1870,productFibCalculator.productFib(1870));
        assertArrayEquals(PF_800,productFibCalculator.productFib(800));
    }
}
