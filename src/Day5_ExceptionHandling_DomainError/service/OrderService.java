package Day5_ExceptionHandling_DomainError.service;

import Day5_ExceptionHandling_DomainError.domain.Order;

public class OrderService {

    public void payOrder(Order order){
        order.pay();
    }
}
