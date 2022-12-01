package models.auth;

import models.library.Material;
import operations.ILogin;
import operations.IRegisterMaterial;
import operations.IRegisterUser;

import java.util.ArrayList;

public class AdminOperation implements IAdminOperation {

    private boolean isLoggedIn = false;
    private IRegisterUser iRegisterUser;
    private IRegisterMaterial iRegisterMaterial;

    public AdminOperation(IRegisterUser iRegisterUser, IRegisterMaterial iRegisterMaterial) {
        this.iRegisterUser = iRegisterUser;
        this.iRegisterMaterial = iRegisterMaterial;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @Override
    public void registerUser() {
        iRegisterUser.call();
    }

    @Override
    public User viewUserProfile() {
        return null;
    }

    @Override
    public void registerMaterial(String[] data, int quantity) {
        iRegisterMaterial.call(data, quantity);
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
