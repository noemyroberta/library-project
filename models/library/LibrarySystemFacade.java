package models.library;

import operations.*;

public class LibrarySystemFacade {

    public static ILogin loginOperation() {
        return new Login();
    }

    public static IViewFines viewFinesOperation() {
        return new ViewFines();
    }

    public static IApplyLoan applyLoanOperation() {
        return new ApplyLoan();
    }

    public static IReturnLoan returnLoanOperation() {
        return new ReturnLoan();
    }

}
