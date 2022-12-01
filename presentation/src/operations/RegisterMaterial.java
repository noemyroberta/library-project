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
        String materialName = data[0];
        String materialISBN = data[1];
        String materialAuthor = data[2];
        String materialEdition = data[3];
        String materialRegisterDate = data[4];
        String materialType = data[5];
        DateFormat date = DateFormat.transformString(materialRegisterDate);

        Material material;
        if (materialType.equals("Livro")) {
            material = new Book(materialName, materialISBN,
                    materialAuthor, materialEdition, date, quantity);
            System.out.println("Material livro " + material.getName() + " registrado!");
        } else {
            material = new Copy(materialName, materialISBN, materialAuthor,
                    materialEdition, date, quantity);
            System.out.println("Material exemplar " + material.getName() + " registrado!");
        }

        MaterialRepository.getInstance();
        MaterialRepository.addMaterial(material);

    }
}
