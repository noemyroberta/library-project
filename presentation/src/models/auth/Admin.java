package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public class Admin extends Person {
    private static Admin instance = null;

    public Admin(String name, String email, String username, String password) {
        super(name, email, username, password);
    }

    public Admin() {
        super();
    }

    public static Admin getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new Admin();
                }
            }
        }
        return instance;
    }

}
