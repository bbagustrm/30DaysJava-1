package Day3_Comparable_Comparator;

class Product {
    private final String id;
    private final String name;
    private final int price;
    private final double rating;

    public Product(String id, String name, int price, double rating){
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getNama(){
        return this.name;
    }

    public double getRating(){
        return this.rating;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
         return name + " | price = " + price + " | rating = " + rating;
    }


}
