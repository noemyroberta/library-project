package models.library;

import operations.*;

public class LibrarySystemFacade {

    public static ILogin loginOperation() {
        return new Login();
    }

    public static IPayFine payFineOperation() {
        return new PayFine();
    }

    public static IRegisterUser registerUserOperation() {
        return new RegisterUser();
    }

    public static IRegisterMaterial registerMaterialOperation() {
        return new RegisterMaterial();
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
