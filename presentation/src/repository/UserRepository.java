package repository;

import models.auth.Admin;
import models.auth.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> instance = null;
    public UserRepository() {

    }

    public static List<User> getInstance() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<User>();
                    addUser(new User("Noemy", "noemy@gmail.com",
                            "noemyroberta", "mypassword"));
                }
            }
        }
        return instance;
    }

    public static void addUser(User user) {
        instance.add(user);
    }

    public static User getUserByName(String name) {
        for (User user : instance) {
            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    public static User getUserByCredentials(String username, String password) {
        for (User user : instance) {
            if (user.getUsername().equals(username) 
                    && user.getPassword().equalsIgnoreCase(password)) {
                return user;

            }
        }

        return null;
    }

    public void getAll() {
        for (User user : instance) {
            System.out.println("\n\n"+ user.toString());
        }
    }

}
