package models.auth;

import models.library.Fine;
import models.library.Loan;
import java.util.List;

public interface IUserOperation {
    public List<Fine> viewFines();
    public void payFine();
    public void applyLoan(String materialType, String ISBN);
    public void returnLoan(Loan loan);
}
