package models.library;

import models.auth.AdminOperation;
import models.auth.UserOperation;

public class PersonFactory implements IPersonOperationFactory {

    @Override
    public UserOperation createUser() {
        return new UserOperation(
                LibrarySystemFacade.loginOperation(),
                LibrarySystemFacade.viewFinesOperation(),
                LibrarySystemFacade.applyLoanOperation(),
                LibrarySystemFacade.returnLoanOperation()
        );
    }

    @Override
    public AdminOperation createAdmin() {
        return new AdminOperation();
    }
}