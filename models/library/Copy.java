package models.library;

import java.util.ArrayList;
import java.util.Date;

public class Copy extends Material {
    private ArrayList<Loan> loans;
    private ArrayList<Fine> fines;

    public Copy(String ISBN, String author, Date registerDate, String edition, ArrayList<Loan> loans, ArrayList<Fine> fines) {
        super(ISBN, author, registerDate, edition);
        this.loans = loans;
        this.fines = fines;
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
