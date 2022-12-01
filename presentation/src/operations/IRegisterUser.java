package operations;

import exceptions.UserNotValidException;

public interface IRegisterUser {
    public void call(String[] data) throws UserNotValidException;
}
