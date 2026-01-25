package Day2_Equal_Hashcode;

import java.util.HashSet;
import java.util.Set;

public class Wishlist {
    public static void main(String[] args){

        Set<String> wishlist = new HashSet<>();

        wishlist.add("P001");
        wishlist.add("P001");
        wishlist.add("P002");

        System.out.println(wishlist);
    }
}
