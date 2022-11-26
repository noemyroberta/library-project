package models.library;

import utils.DateFormat;

public abstract class Material {
    private String ISBN;
    private String author;
    private DateFormat registerDate;
    private String edition;

    public Material(String ISBN, String author, String edition, DateFormat registerDate) {
        this.ISBN = ISBN;
        this.author = author;
        this.registerDate = registerDate;
        this.edition = edition;
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
