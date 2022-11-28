package operations;

import models.library.Loan;
import models.library.fine_payment_strategy.*;
import repository.LoanRepository;

import java.util.Scanner;

public class PayFine implements IPayFine {
    Scanner input = new Scanner(System.in);

    @Override
    public void call() {
        System.out.println("PAGAMENTO DE MULTA ===============================");

        System.out.println("Digite o código da multa");
        int fineId = input.nextInt();

        LoanRepository.getInstance();

        if (LoanRepository.getLoanByFineId(fineId) != null) {
            System.out.println("Selecione o meio de pagamento");
            System.out.println("0. GRU");
            System.out.println("1. Cartão de Crédito");
            System.out.println("2. Cartão de Débito");

            IFinePaymentStrategy finePayment = null;
            Loan loan = LoanRepository.getLoanByFineId(fineId);
            int paymentType = input.nextInt();

            switch (paymentType) {
                case 0 -> finePayment = new GRUPayment();
                case 1 -> finePayment = new CreditCardPayment();
                case 2 -> finePayment = new DebitCardPayment();
                default -> System.out.println("Selecione uma opção válida");
            }

            assert finePayment != null;
            assert loan != null;
            finePayment.pay(loan.getFine());
        }
    }
}
