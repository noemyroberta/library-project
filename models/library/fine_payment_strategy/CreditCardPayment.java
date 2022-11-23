package models.library.fine_payment_strategy;

import models.library.Fine;

import java.util.Scanner;

public class CreditCardPayment implements IFinePaymentStrategy {

    @Override
    public boolean pay(Fine fine) {
        System.out.println("\nCARTÃO DE CRÉDITO ==========================");
        System.out.println("Digite o número do cartão");
        System.out.println("Formato | (0123 4567 8910 1112)");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        System.out.println("Digite o número do CVC (012)");
        String cvc = input.nextLine();

        System.out.println("Digite a validade do cartão (01/23)");
        String date = input.nextLine();

        if (!number.isEmpty() && !date.isEmpty() && !cvc.isEmpty()) {
            System.out.println("Pagamento de R$ "+fine.getFineValue()+",00 efetuado com sucesso!");
            System.out.println("===========================================");
            return true;
        }
        return false;
    }
}
