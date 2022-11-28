package models.library;

import models.auth.User;
import models.library.fine_observable.FineSubject;
import utils.DateFormat;

public class Fine {
    private int id = 0;
    private User user;
    private Material material;
    private final FineSubject subject;

    public Fine() {
        this.subject = new FineSubject();
        id += 1;
    }

    public Fine(User user, Material material, DateFormat returnDate) {
        this.user = user;
        this.material = material;
        this.subject = new FineSubject();
        calculateTotalFine(returnDate);
        id += 1;
    }

    public void calculateTotalFine(DateFormat returnDate) {
        for (int i = 0; i < DateFormat.getQuantityOfDaysBeforeToday(returnDate); i++) {
            updateFineValue();
        }
    }

    public int getId() {
        return id;
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
                "id=" + id +
                ", user=" + user +
                ", material=" + material +
                ", subject=" + subject +
                '}';
    }
}
