package operations;

import exceptions.*;

public interface ILogin {
    public void call(String loginType, String username, String password) 
            throws AdminNotFoundException, UserNotFoundException, NoneRegisterException;
}
