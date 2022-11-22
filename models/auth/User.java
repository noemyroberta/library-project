package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public class User extends Person {
    private ArrayList<Loan> loans = new ArrayList<Loan>();
    private ArrayList<Fine> fines = new ArrayList<Fine>();

    public User() {}

    public User(String name, String email, String username, String password, ArrayList<Loan> loans, ArrayList<Fine> fines) {
        super(name, email, username, password);
        this.loans = loans;
        this.fines = fines;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    public ArrayList<Fine> getFines() {
        return fines;
    }

    public void addFine(Fine fine) {
        this.fines.add(fine);
    }

    @Override
    public String toString() {
        return "User{" +
                "loans=" + loans +
                ", fines=" + fines +
                '}';
    }
}
