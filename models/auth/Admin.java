package models.auth;

public class Admin extends Person {

    public Admin() {

    }

    public Admin(String name, String email, String username, String password) {
        super(name, email, username, password);
    }

}
