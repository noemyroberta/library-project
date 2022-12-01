package models.auth;

import exceptions.UserNotValidException;
import models.library.Material;

import java.util.ArrayList;

public interface IAdminOperation {
    public void registerUser(String[] data) throws UserNotValidException;
    public User viewUserProfile();
    public void registerMaterial(String[] data, int quantity);
    public Material searchMaterial(String ISBN);
    public ArrayList<Material> viewMaterialCloseToReturnDate();
}
