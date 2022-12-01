package models.auth;

import operations.*;
import models.library.Fine;
import models.library.Loan;

import java.util.List;

public class UserOperation implements IUserOperation {

    private IViewFines iViewFines;
    private IApplyLoan iApplyLoan;
    private IReturnLoan iReturnLoan;
    private IPayFine iPayFine;

    public UserOperation(IViewFines iViewFines, IApplyLoan iApplyLoan, 
            IReturnLoan iReturnLoan, IPayFine iPayFine) {
        this.iViewFines = iViewFines;
        this.iApplyLoan = iApplyLoan;
        this.iReturnLoan = iReturnLoan;
        this.iPayFine = iPayFine;
    }

    @Override
    public List<Fine> viewFines() {
        return iViewFines.call();
    }

    @Override
    public void payFine() {
        iPayFine.call();
    }

    @Override
    public void applyLoan(String materialType, String ISBN) {
        iApplyLoan.call(materialType, ISBN);
    }

    @Override
    public void returnLoan(Loan loan) {
        iReturnLoan.call();
    }
}
