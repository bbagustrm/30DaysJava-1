package Day2_Equal_Hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product {
    final String id;

    Product(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


public class HashSetSuccessDemo {
    public static void main(String[] args) {
        Set<Product> wishlist = new HashSet<>();

        wishlist.add(new Product("P001"));
        wishlist.add(new Product("P001"));

        System.out.println(wishlist.size());
    }
}
