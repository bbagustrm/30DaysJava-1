package Day4_Enum;

public class Main {
    public static void main(String[] args){
        Order order = new Order("ORD-001");

        order.changeStatus(OrderStatus.PAID);
//        order.changeStatus(OrderStatus.SHIPPED);
        order.changeStatus(OrderStatus.REFUNDED);
//        order.changeStatus(OrderStatus.DELIVERED);

//        order.changeStatus(OrderStatus.CREATED);
//        order.changeStatus(OrderStatus.CANCELLED);

        System.out.println("Final status: " + order.getStatus());


    }
}
