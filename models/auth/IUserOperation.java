package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public interface IUserOperation {
    public ArrayList<Fine> viewFines();
    public void applyLoan(Loan loan);
    public void returnLoan(Loan loan);
}
