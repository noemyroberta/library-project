package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;
import java.util.List;

public interface IUserOperation {
    public List<Fine> viewFines();
    public void applyLoan();
    public void returnLoan(Loan loan);
}
