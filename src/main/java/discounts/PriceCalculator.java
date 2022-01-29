package discounts;

import java.util.ArrayList;

public class PriceCalculator {
    private ArrayList<Double> prices = new ArrayList<>();
    private int discount = 0;

    public double getTotal() {
        double total = 0.0;
        for (Double price : prices) {
            total += price;
        }

        return total - (total * discount / 100) ;
    }
    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(int percent) {
        discount = percent;
    }
}
