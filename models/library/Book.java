package models.library;

import utils.DateFormat;


public class Book extends Material {

    public Book(String ISBN, String author, String edition, DateFormat registerDate) {
        super(ISBN, author, edition, registerDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
