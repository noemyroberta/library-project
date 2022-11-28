package operations;

import models.auth.Admin;
import models.auth.Person;
import models.auth.User;
import repository.AdminRepository;
import repository.UserRepository;

import java.util.Scanner;

public class Login implements ILogin {

    Scanner input = new Scanner(System.in);

    @Override
    public void call(String loginType) {
        UserRepository.getInstance();
        AdminRepository.getInstance();

        System.out.println("Digite o nome de usuário");
        String username = input.nextLine();

        System.out.println("Digite a senha");
        String password = input.nextLine();

        System.out.println("Aguarde, estamos validando sua entrada...");

        if (checkRegisterExist(username, password)) {
            if (loginType.equals("admin")) {
                if (AdminRepository.getAdminByCredentials(username, password) != null) {
                    System.out.println("Administrador reconhecido!");
                    Admin adminFound = AdminRepository.getAdminByCredentials(username, password);

                    Admin instance = Admin.getInstance();
                    turnOnAsInstance(adminFound, instance);
                } else {
                    System.out.println("Administrador não reconhecido. Favor, logar como usuário");
                }

            } else {
                if (UserRepository.getUserByCredentials(username, password) != null) {
                    System.out.println("Usuário reconhecido!");
                    User userFound = UserRepository.getUserByCredentials(username, password);

                    User instance = User.getInstance();
                    turnOnAsInstance(userFound, instance);
                } else {
                    System.out.println("Usuário não reconhecido. Favor, logar como administrador");
                }

            }

        } else {
            System.exit(0);
        }
    }

    private boolean checkRegisterExist(String username, String password) {
        boolean isUser = UserRepository.getUserByCredentials(username, password) != null;
        boolean isAdmin = AdminRepository.getAdminByCredentials(username, password) != null;

        if (!isUser && !isAdmin) {
            System.out.println("Ops! Parece que não há registros desse login em nosso sistema.");
            System.err.println("Por favor, contate um administrador para registrar.");
            return false;
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
