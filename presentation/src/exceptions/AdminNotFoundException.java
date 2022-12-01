package exceptions;

/**
 *
 * @author noemyroberta
 */
public class AdminNotFoundException extends Exception {

    public AdminNotFoundException(String errorMessage) {
        super(errorMessage);
    }
    
}
