package models.library;

import models.auth.User;
import utils.DateFormat;

public class Loan {
    private User user;
    private Material material;
    private DateFormat returnDate;
    private Fine fine;
    private StatusLoan status;

    public Loan(User user, Material material) {
        this.user = user;
        this.material = material;
        this.returnDate = new DateFormat();
        this.fine = createFine();
        this.status = StatusLoan.LOANED;
    }

    private Fine createFine() {
        if (DateFormat.isBeforeToday(returnDate)) {
            Fine fine = new Fine(user, material, returnDate);
            return fine;
        }
        return new Fine();
    }

    public StatusLoan getStatus() {
        return status;
    }

    public void setStatus(StatusLoan status) {
        this.status = status;
    }
    
    public Fine getFine() {return fine;}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public DateFormat getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(DateFormat returnDate) {
        this.returnDate = returnDate;
        this.fine = createFine();
    }

    @Override
    public String toString() {
        return "Loan{" +
                "user=" + user +
                ", material=" + material +
                ", returnDate=" + returnDate +
                ", fine=" + fine +
                '}';
    }
}
