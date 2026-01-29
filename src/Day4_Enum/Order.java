package Day4_Enum;

public class Order {
    private final String orderNumber;
    private OrderStatus status;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.CREATED;
    }

    public void changeStatus(OrderStatus newStatus) {
        if (!status.canMoveTo(newStatus)) {
            throw new IllegalStateException(
                    "Invalid status transition: " + status + " -> " + newStatus
            );
        }
        this.status = newStatus;
    }

    public OrderStatus getStatus(){
        return status;
    }
}
