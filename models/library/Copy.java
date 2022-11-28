package models.library;

import utils.DateFormat;

import java.util.ArrayList;

public class Copy extends Material {

    public Copy(String name, String ISBN, String author, String edition, DateFormat registerDate) {
        super(name, ISBN, author, edition, registerDate);
    }

    @Override
    public String toString() {
        return "Copy{" +
                super.toString() +
                '}';
    }
}
