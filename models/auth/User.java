package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public class User extends Person {
    private ArrayList<Loan> loans;
    private ArrayList<Fine> fines;

    private static User instance = null;

    public User() {

    }

    public User(String name, String email, String username, String password) {
        super(name, email, username, password);
        this.loans = new ArrayList<Loan>();
        this.fines = new ArrayList<Fine>();
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
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
