import models.auth.User;
import models.library.Copy;
import models.library.Loan;
import models.library.fine_payment_strategy.DebitCardPayment;
import models.library.fine_payment_strategy.IFinePaymentStrategy;
import utils.DateFormat;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Loan loan = new Loan(user, new Copy("0AWD", "Noemy", new DateFormat(2, 5, 2022), "primeira"));
        loan.setReturnDate(new DateFormat(2, 11, 2022));

        IFinePaymentStrategy payment = new DebitCardPayment();
        payment.pay(loan.getFine());

    }
}
