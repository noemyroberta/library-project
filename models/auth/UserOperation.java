package models.auth;

import operations.IApplyLoan;
import operations.ILogin;
import operations.IReturnLoan;
import operations.IViewFines;
import models.library.Fine;
import models.library.Loan;

import java.util.List;

public class UserOperation implements IUserOperation {

    private ILogin iLogin;
    private IViewFines iViewFines;
    private IApplyLoan iApplyLoan;
    private IReturnLoan iReturnLoan;

    public UserOperation(ILogin iLogin, IViewFines iViewFines, IApplyLoan iApplyLoan, IReturnLoan iReturnLoan) {
        this.iLogin = iLogin;
        this.iViewFines = iViewFines;
        this.iApplyLoan = iApplyLoan;
        this.iReturnLoan = iReturnLoan;
    }

    @Override
    public void login() {
        iLogin.call();
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
