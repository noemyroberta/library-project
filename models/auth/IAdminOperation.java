package models.auth;

import models.library.Material;

import java.util.ArrayList;

public interface IAdminOperation {
    public void registerUser();
    public User viewUserProfile();
    public void registerMaterial(Material material);
    public Material searchMaterial(String ISBN);
    public ArrayList<Material> viewMaterialCloseToReturnDate();
}
