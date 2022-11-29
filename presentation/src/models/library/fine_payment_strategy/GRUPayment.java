package models.library.fine_payment_strategy;

import models.library.Fine;

import java.util.Scanner;

public class GRUPayment implements IFinePaymentStrategy {

    @Override
    public boolean pay(Fine fine) {
        System.out.println("\nGRU =======================================");
        System.out.println("Digite o CPF para efetuar o pagamento:");
        Scanner input = new Scanner(System.in);
        String cpf = input.nextLine();

        if (cpf != null) {
            System.out.println("Pagamento de R$ "+fine.getFineValue()+",00 efetuado com sucesso!");
            System.out.println("===========================================");
            return true;
        }

        return false;
    }
}
