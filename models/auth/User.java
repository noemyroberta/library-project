package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public class User extends Person {
    private ArrayList<Loan> loans;
    private ArrayList<Fine> fines;

    public User(String name, String email, String username, String password, ArrayList<Loan> loans, ArrayList<Fine> fines) {
        super(name, email, username, password);
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
}
