package Day2_Equal_Hashcode;

import java.util.HashMap;
import java.util.Map;

public class CartDemo {
    public static void main(String[] args){

        Map<String, Integer> cart = new HashMap<>();

        cart.put("P001", 1);
        cart.put("P002", 1);

        // user klik "tambah" untuk produk yang sama

        cart.put("P001", 3);

        System.out.println(cart);

        // in memory
        // bucket[3] → ("P001", 3)
        // bucket[7] → ("P002", 2)

    }
}
