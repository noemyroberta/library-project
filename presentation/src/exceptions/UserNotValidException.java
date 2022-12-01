package exceptions;

/**
 *
 * @author noemyroberta
 */
public class UserNotValidException extends Exception {
    public UserNotValidException(String errorMessage) {
        super(errorMessage);
    }
    
}
