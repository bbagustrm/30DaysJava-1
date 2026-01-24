package Day1_Inheritance_Composition;

public class NewYearPricing implements PricingStrategy{
    private double newYearPrecentage;

    public NewYearPricing(double newYearPrecentage){
        this.newYearPrecentage = newYearPrecentage;
    }

    @Override
    public double calculatePrice(double basePrice){
        return basePrice - (basePrice * newYearPrecentage / 100);
    }
}
