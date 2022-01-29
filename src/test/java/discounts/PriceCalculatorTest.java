package discounts;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_no_price() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(0.0, calculator.getTotal());
    }

    @Test
    public void total_is_the_sum_of_price() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertEquals(25.7, calculator.getTotal());
    }


    @Test
    public void apply_discount_to_price() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(15.0);
        calculator.addPrice(15.0);
        calculator.setDiscount(50);

        assertEquals(15.0, calculator.getTotal());
    }
}
