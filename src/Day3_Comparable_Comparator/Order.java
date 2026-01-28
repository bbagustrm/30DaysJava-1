package Day3_Comparable_Comparator;

import java.time.LocalDateTime;

public class Order implements Comparable<Order>{
    private final String orderName;
    private final LocalDateTime createdAt;

    public Order(String orderName, LocalDateTime createdAt){
        this.orderName = orderName;
        this.createdAt = createdAt;
    }

    @Override
    public int compareTo(Order other){
        return this.createdAt.compareTo(other.createdAt);
    }

    @Override
    public String toString(){
        return orderName + " | " + createdAt;
    }

}
