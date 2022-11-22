package models.library;

import utils.DateFormat;

import java.util.ArrayList;

public class Copy extends Material {
    private ArrayList<Loan> loans;
    private ArrayList<Fine> fines;

    public Copy(String ISBN, String author, DateFormat registerDate, String edition) {
        super(ISBN, author, registerDate, edition);
        this.loans = new ArrayList<Loan>();
        this.fines = new ArrayList<Fine>();
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public ArrayList<Fine> getFines() {
        return fines;
    }

    public void setFines(ArrayList<Fine> fines) {
        this.fines = fines;
    }

    @Override
    public String toString() {
        return "Copy{" +
                "loans=" + loans +
                ", fines=" + fines +
                super.toString() +
                '}';
    }
}
