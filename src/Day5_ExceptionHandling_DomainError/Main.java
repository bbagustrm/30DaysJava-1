package Day5_ExceptionHandling_DomainError;

import Day5_ExceptionHandling_DomainError.domain.Order;
import Day5_ExceptionHandling_DomainError.exception.BusinessException;
import Day5_ExceptionHandling_DomainError.service.OrderService;

public class Main {
    public static void main(String[] args){
        OrderService service = new OrderService();

        Order order = new Order("ORD-001");

        // FLOW NORMAL
        service.payOrder(order);
        System.out.println("Order status: " + order.getStatus());

        // BUSINESS ERROR
        try {
            service.payOrder(order);
        } catch (BusinessException e) {
            System.out.println("BUSINESS ERROR: " + e.getMessage());
        }

        // SYSTEM ERRR (GENERIC)
        try {
            String s = null;
            s.length();
        } catch (Exception e){
            System.out.println("SYSTEM ERROR: " + e.getClass().getSimpleName());
        }

    }
}
