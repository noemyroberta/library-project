package models.library;

import utils.DateFormat;

import java.util.Date;

public class Book extends Material {

    public Book(String ISBN, String author, DateFormat registerDate, String edition) {
        super(ISBN, author, registerDate, edition);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
