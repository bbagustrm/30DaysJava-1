package Day1_Inheritance_Composition;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Product product = new Product("Laptop", 10_000_000);

        PriceCalculator calculator = new PriceCalculator(
                List.of(
                        new NewYearPricing(24),
                        new TaxPricing(10)
                )
        );

        double finalPrice = calculator.calculate(product.getBasePrice());

        System.out.println("Final Price : " + finalPrice);
    }
}
