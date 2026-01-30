package Day5_ExceptionHandling_DomainError.exception;

public class InvalidOrderStatusException extends BusinessException{

    public InvalidOrderStatusException(String from, String to) {
        super("Invalid status transition: " + from + " -> " + to);
    }
}
