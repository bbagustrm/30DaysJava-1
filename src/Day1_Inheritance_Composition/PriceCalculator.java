package Day1_Inheritance_Composition;

import java.util.List;

public class PriceCalculator {
    private List<PricingStrategy> strategies;

    public PriceCalculator(List<PricingStrategy> strategies){
        this.strategies = strategies;
    }

    public double calculate(double basePrice){
        double price = basePrice;
        for (PricingStrategy strategy : strategies){
            price = strategy.calculatePrice(price);
        }
        return price;
    }

}
