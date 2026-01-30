package Day5_ExceptionHandling_DomainError.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message){
        super(message);
    }

}
