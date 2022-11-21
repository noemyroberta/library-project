package models.library;

import java.util.Date;

public abstract class Material {
    private String ISBN;
    private String author;
    private Date registerDate;
    private String edition;

    public Material(String ISBN, String author, Date registerDate, String edition) {
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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
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
