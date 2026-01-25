package Day2_Equal_Hashcode;

import java.util.HashSet;
import java.util.Set;

class Product1 {
    String id;

    Product1(String id){
        this.id = id;
    }
}


public class HashSetBugDemo {
    public static void main(String[] args) {
        Set<Product1> wishlist = new HashSet<>();

        wishlist.add(new Product1("P001"));
        wishlist.add(new Product1("P001"));

        System.out.println(wishlist.size());
    }
}
