package operations;

import exceptions.UserNotValidException;
import models.auth.User;
import repository.UserRepository;
import utils.Validator;

import java.util.Scanner;

public class RegisterUser implements IRegisterUser {
    Scanner input = new Scanner(System.in);

    @Override
    public void call(String[] data) throws UserNotValidException {
        User newUser = createUserRegister(data);

        if (!validateUserRegister(newUser)) {
            throw new UserNotValidException("Usuário não pôde ser criado."
                    + "\nVerifique os campos e digite corretamente");
        } else {
            UserRepository.getInstance();
            UserRepository.addUser(newUser);
            System.out.println("Usuário " + newUser.getName() + " criado com sucesso! ============");
        }
    }

    private User createUserRegister(String[] data) {
        return new User(data[0], data[2], data[1], data[1]);
    }
    

    private boolean validateUserRegister(User newUser) {
        return Validator.validatePerson(newUser);
    }
}
