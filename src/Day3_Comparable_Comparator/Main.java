package Day3_Comparable_Comparator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Mouse", 10_000, 4.5));
        products.add(new Product("P002", "Keyboard", 300_000, 4.2));
        products.add(new Product("P003", "Laptop", 5_000_000, 4.7));

        // Comparator: sort by price (ASC)
        Comparator<Product> sortByPriceAsc = Comparator.comparingInt(Product::getPrice);

        // Comparator: sort by rating (DESC)
        Comparator<Product> sortByRatingDesc = Comparator.comparingDouble(Product::getRating).reversed();

        System.out.println("=== SORT BY PRICE (ASC) ===");
        products.sort(sortByPriceAsc);
        products.forEach(System.out::println);

        System.out.println("\n=== SORT BY RATING (DESC) ===");
        products.sort(sortByRatingDesc);
        products.forEach(System.out::println);


        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ORD-003", LocalDateTime.of(2024, 1, 10, 10, 10, 30)));
        orders.add(new Order("ORD-001", LocalDateTime.of(2024, 1, 5, 9, 0)));
        orders.add(new Order("ORD-002", LocalDateTime.of(2024, 1, 8, 14, 15)));

        System.out.println("=== BEFORE SORT ===");
        orders.forEach(System.out::println);

        Collections.sort(orders);

        System.out.println("=== AFTER SORT ===");
        orders.forEach(System.out::println);


    }
}
