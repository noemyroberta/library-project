import models.auth.*;
import models.library.Copy;
import models.library.LibrarySystem;
import models.library.Loan;
import models.library.PersonFactory;
import models.library.fine_payment_strategy.DebitCardPayment;
import models.library.fine_payment_strategy.IFinePaymentStrategy;
import utils.DateFormat;

public class Main {
    public static void main(String[] args) {
        IUserOperation os = (new PersonFactory()).createUser();
        IAdminOperation as = (new PersonFactory()).createAdmin();


//        User user = new User();
//        Loan loan = new Loan(user, new Copy("0AWD", "Noemy", new DateFormat(2, 5, 2022), "primeira"));
//        loan.setReturnDate(new DateFormat(2, 11, 2022));
//
//        IFinePaymentStrategy payment = new DebitCardPayment();
//        payment.pay(loan.getFine());
////
////        AdminOperation adm = new AdminOperation();
////        adm.registerUser();

    }
}
