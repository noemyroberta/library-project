package operations;

import models.auth.User;
import repository.UserRepository;
import utils.Validator;

import java.util.Scanner;

public class RegisterUser implements IRegisterUser {
    Scanner input = new Scanner(System.in);

    @Override
    public void call() {
        User newUser = createUserRegister();

        if (!validateUserRegister(newUser)) {
            System.err.println("Usuário não pôde ser criado.");
        } else {
            UserRepository.getInstance();
            UserRepository.addUser(newUser);
            System.out.println("Usuário " + newUser.getName() + " criado com sucesso! ============");
        }
    }

    private User createUserRegister() {
        System.out.println("");
        System.out.println("CRIAÇÃO DE USUÁRIO ===============================");
        System.out.println("Digite o nome completo");
        String name = input.nextLine();
        System.out.println("Digite o nome de usuário");
        String username = input.nextLine();
        System.out.println("Digite o e-mail do usuário");
        String email = input.nextLine();
        System.out.println("Peça para o usuário digitar a senha de acesso");
        String password = input.nextLine();

        return new User(name, email, username, password);
    }

    private boolean validateUserRegister(User newUser) {
        System.out.println("VALIDANDO DADOS ==============================");
        return Validator.validatePerson(newUser);
    }
}
