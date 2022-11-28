package models.auth;

import operations.IApplyLoan;
import operations.ILogin;
import operations.IReturnLoan;
import operations.IViewFines;
import models.library.Fine;
import models.library.Loan;

import java.util.List;

public class UserOperation implements IUserOperation {

    private IViewFines iViewFines;
    private IApplyLoan iApplyLoan;
    private IReturnLoan iReturnLoan;

    public UserOperation(IViewFines iViewFines, IApplyLoan iApplyLoan, IReturnLoan iReturnLoan) {
        this.iViewFines = iViewFines;
        this.iApplyLoan = iApplyLoan;
        this.iReturnLoan = iReturnLoan;
    }

    @Override
    public List<Fine> viewFines() {
        return iViewFines.call();
    }

    @Override
    public void applyLoan() {
        iApplyLoan.call();
    }

    @Override
    public void returnLoan(Loan loan) {
        iReturnLoan.call();
    }
}
