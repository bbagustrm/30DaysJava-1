package Day1_Inheritance_Composition;

public class DiscountPricing implements PricingStrategy{
    private double discountPrecentage;

    public DiscountPricing(double discountPrecentage){
        this.discountPrecentage = discountPrecentage;
    }

    @Override
    public double calculatePrice(double basePrice){
        return basePrice - (basePrice * discountPrecentage / 100);
    }
}
