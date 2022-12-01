package repository;

import models.library.Material;

import java.util.ArrayList;
import java.util.List;
import models.library.Book;
import utils.DateFormat;

public class MaterialRepository {
    private static List<Material> instance = null;

    public MaterialRepository() {

    }

    public static List<Material> getInstance() {
        if (instance == null) {
            synchronized (MaterialRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<Material>();
                    addMaterial(new Book("As aventuras de Pi", "0000000000123", 
                            "Unknowm", "First", 
                            new DateFormat(1, 12, 2013), 2));
                }
            }
        }
        return instance;
    }

    public static void addMaterial(Material material) {
        instance.add(material);
    }

    public static Material searchMaterialByISBN(String ISBN) {
        for (Material material : instance) {
            if (material.getISBN().equals(ISBN)) {
                return material;
            }
        }

        return null;
    }

    public void getAll() {
        for (Material material : instance) {
            System.out.println("\n\n"+ material.toString());
        }
    }

}
