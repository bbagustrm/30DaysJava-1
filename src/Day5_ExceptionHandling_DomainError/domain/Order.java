package Day5_ExceptionHandling_DomainError.domain;

import Day5_ExceptionHandling_DomainError.exception.InvalidOrderStatusException;
import Day5_ExceptionHandling_DomainError.exception.OrderAlreadyPaidException;

public class Order {

    private final String orderNumber;
    private OrderStatus status;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.CREATED;
    }

    public void pay() {
        if (status == OrderStatus.PAID){
            throw new OrderAlreadyPaidException(orderNumber);
        }

        if (status != OrderStatus.CREATED){
            throw new InvalidOrderStatusException(
                    status.name(),
                    OrderStatus.PAID.name()
            );
        }

        status = OrderStatus.PAID;
    }

    public OrderStatus getStatus(){
        return status;
    }

}
