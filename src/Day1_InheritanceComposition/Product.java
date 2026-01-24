package Day1_InheritanceComposition;

public class Product {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
