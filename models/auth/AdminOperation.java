package models.auth;

import models.library.Material;

import java.util.ArrayList;

public class AdminOperation implements IAdminOperation {
    @Override
    public void registerUser(User user) {

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
