package models.library.fine_payment_strategy;

import models.library.Fine;

public interface IFinePaymentStrategy {
    public boolean pay(Fine fine);
}
