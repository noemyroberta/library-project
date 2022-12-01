package models.library;

import utils.DateFormat;

public abstract class Material {
    private String ISBN;
    private String name;
    private String author;
    private DateFormat registerDate;
    private String edition;
    private int quantity;

    public Material(String name, String ISBN, String author, String edition, DateFormat registerDate, int quantity) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.registerDate = registerDate;
        this.edition = edition;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public DateFormat getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(DateFormat registerDate) {
        this.registerDate = registerDate;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Material{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", registerDate=" + registerDate +
                ", edition='" + edition + '\'' +
                '}';
    }
}
