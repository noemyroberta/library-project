package models.library;

import utils.DateFormat;


public class Book extends Material {

    public Book(String name, String ISBN, String author, String edition, DateFormat registerDate, int quantity) {
        super(name, ISBN, author, edition, registerDate, quantity);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
