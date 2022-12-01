package operations;

import models.library.Book;
import models.library.Copy;
import models.library.Material;
import repository.MaterialRepository;
import utils.DateFormat;

import java.util.Scanner;

public class RegisterMaterial implements IRegisterMaterial {
    Scanner input = new Scanner(System.in);

    @Override
    public void call(String[] data, int quantity) {

        String option = "s";
        do {
            System.out.println("Digite o nome do material ");
            String materialName = input.nextLine();

            System.out.println("Digite o nome do autor ");
            String materialAuthor = input.nextLine();

            System.out.println("Digite o código ISBN ");
            String materialISBN = input.nextLine();

            System.out.println("Digite a edição ");
            String materialEdition = input.nextLine();

            System.out.println("Digite a data de registro ");
            String materialRegisterDate = input.nextLine();
            DateFormat date = DateFormat.transformString(materialRegisterDate);

            System.out.println("Qual o tipo de material? (Livro/Exemplar)");
            String materialType = input.nextLine();

            Material material;
            if (materialType.equals("Livro")) {
                material = new Book(materialName, materialISBN, 
                        materialAuthor, materialEdition, date, quantity);
                System.out.println("Material livro "+material.getName()+" registrado!");
            } else {
                material = new Copy(materialName, materialISBN, materialAuthor,
                        materialEdition, date, quantity);
                System.out.println("Material exemplar "+material.getName()+" registrado!");
            }

            MaterialRepository.getInstance();
            MaterialRepository.addMaterial(material);

            System.out.println("Deseja registrar outro material? (s/n)");
            option = input.nextLine();

        } while(!option.equals("n"));
    }
}
