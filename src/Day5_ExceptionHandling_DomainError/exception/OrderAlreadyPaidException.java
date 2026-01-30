package Day5_ExceptionHandling_DomainError.exception;

public class OrderAlreadyPaidException extends BusinessException{

    public OrderAlreadyPaidException(String orderNumber){
        super("Order " + orderNumber + " is already PAID");
    }
}
