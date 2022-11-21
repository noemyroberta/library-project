package models.library;

import java.util.Date;

public class Book extends Material {

    public Book(String ISBN, String author, Date registerDate, String edition) {
        super(ISBN, author, registerDate, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
