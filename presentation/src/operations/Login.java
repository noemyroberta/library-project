package operations;

import exceptions.*;
import models.auth.*;
import repository.*;


public class Login implements ILogin {

    @Override
    public void call(String loginType, String username, String password) 
        throws AdminNotFoundException, UserNotFoundException, NoneRegisterException {
        
        UserRepository.getInstance();
        AdminRepository.getInstance();

        if (checkRegisterExist(username, password)) {
            if (loginType.equals("admin")) {
                if (AdminRepository.getAdminByCredentials(username, password) != null) {
                    Admin adminFound = AdminRepository.getAdminByCredentials(username, password);

                    Admin instance = Admin.getInstance();
                    turnOnAsInstance(adminFound, instance);
                } else {
                    throw new AdminNotFoundException("Administrador não reconhecido. Favor, logar como usuário.");
                }

            } else {
                if (UserRepository.getUserByCredentials(username, password) != null) {
                    User userFound = UserRepository.getUserByCredentials(username, password);

                    User instance = User.getInstance();
                    
                    turnOnAsInstance(userFound, instance);
                    System.out.println(instance.toString());
                } else {
                    throw new UserNotFoundException("Usuário não reconhecido. Favor, logar como administrador.");
                }

            }

        }
    }

    private boolean checkRegisterExist(String username, String password) throws NoneRegisterException {
        boolean isUser = UserRepository.getUserByCredentials(username, password) != null;
        boolean isAdmin = AdminRepository.getAdminByCredentials(username, password) != null;

        if (!isUser && !isAdmin) {
            throw new NoneRegisterException(""
                    + "Ops! Parece que não há registros desse login em nosso sistema."
                    + "\nPor favor, contate um administrador para registrar.");
        }

        return true;
    }


    private void turnOnAsInstance(Person found, Person instance) {
        instance.setName(found.getName());
        instance.setUsername(found.getUsername());
        instance.setPassword(found.getPassword());
        instance.setEmail(found.getEmail());
        instance.setIsLoggedIn(true);
    }
}
