package repository;

import models.auth.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepository {
    private static List<Admin> instance = null;

    public AdminRepository() {

    }

    public static List<Admin> getInstance() {
        if (instance == null) {
            synchronized (AdminRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<Admin>();
                    addAdmin(new Admin("Admin1", "bibliotecadmin@gmail.com",
                            "admin1", "mypasswordadmin"));
                }
            }
        }
        return instance;
    }

    public static void addAdmin(Admin admin) {
        instance.add(admin);
    }

    public static Admin searchAdminByName(String name) {
        for (Admin admin : instance) {
            if (admin.getName().equals(name)) {
                return admin;
            }
        }

        return null;
    }


    public static Admin getAdminByCredentials(String username, String password) {
        for (Admin admin : instance) {
            if (admin.getUsername().equals(username) && admin.getPassword().equalsIgnoreCase(password)) {
                return admin;
            }
        }

        return null;
    }


    public static void getAll() {
        for (Admin admin : instance) {
            System.out.println("\n\n"+ admin.toString());
        }
    }
}
