package Day1_Inheritance_Composition;

public class TaxPricing implements PricingStrategy{
    private double taxPrecentage;

    public TaxPricing(double taxPrecentage){
        this.taxPrecentage = taxPrecentage;
    }

    @Override
    public double calculatePrice(double basePrice){
        return basePrice + (basePrice * taxPrecentage / 100);
    }

}
