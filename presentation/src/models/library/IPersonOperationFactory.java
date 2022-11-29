package models.library;

import models.auth.AdminOperation;
import models.auth.UserOperation;

public interface IPersonOperationFactory {
    public UserOperation createUser();
    public AdminOperation createAdmin();
}

