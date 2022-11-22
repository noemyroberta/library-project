package models.auth;

import models.library.Fine;
import models.library.Loan;

import java.util.ArrayList;

public class UserOperation implements IUserOperation {
    @Override
    public ArrayList<Fine> viewFines() {
        return null;
    }

    @Override
    public void applyLoan(Loan loan) {

    }

    @Override
    public void returnLoan(Loan loan) {

    }
}
