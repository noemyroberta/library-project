package models.library;

import models.auth.User;
import models.library.observable.FineSubject;
import utils.DateFormat;

public class Fine {
    private User user;
    private Material material;
    private final FineSubject subject;

    public Fine() {
        this.subject = new FineSubject();
    }

    public Fine(User user, Material material, DateFormat returnDate) {
        this.user = user;
        this.material = material;
        this.subject = new FineSubject();
        calculateTotalFine(returnDate);
    }

    public void calculateTotalFine(DateFormat returnDate) {
        for (int i = 0; i < DateFormat.getQuantityOfDaysBeforeToday(returnDate); i++) {
            updateFineValue();
        }
    }

    private void updateFineValue() {
        this.subject.setState();
    }

    public Integer getFineValue() {
        return this.subject.getState();
    }

    @Override
    public String toString() {
        return "Fine{" +
                "user=" + user +
                ", material=" + material +
                ", fineValue=" + getFineValue() +
                '}';
    }
}
