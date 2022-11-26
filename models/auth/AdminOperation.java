package models.auth;

import models.library.Material;
import utils.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminOperation implements IAdminOperation {
    Scanner input = new Scanner(System.in);

    @Override
    public void registerUser() {
        User newUser = createUserRegister();

        if (!validateUserRegister(newUser)) {
            System.err.println("Usuário não pôde ser criado.");
            System.out.println("Deseja tentar novamente? (s/n)");
            String response = input.nextLine();

            if (response.toUpperCase().equals("S")) {
                newUser = createUserRegister();

                if (validateUserRegister(newUser))
                    System.out.println("Usuário " + newUser.getName() + " criado com sucesso! ============");
                else
                    System.err.println("Desculpe, usuário não pôde ser criado.");

            } else {
                System.exit(0);
            }
        }
        System.out.println("Usuário " + newUser.getName() + " criado com sucesso! ============");
        // TODO: add `newUser` to the library system list of users
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

    @Override
    public User viewUserProfile() {
        return null;
    }

    @Override
    public void registerMaterial(Material material) {

    }

    @Override
    public Material searchMaterial(String ISBN) {
        return null;
    }

    @Override
    public ArrayList<Material> viewMaterialCloseToReturnDate() {
        return null;
    }
}
