package models.library;

import models.auth.User;

import java.util.Date;

public class Loan {
    private User user;
    private Material material;
    private Date returnDate;

    public Loan(User user, Material material, Date returnDate) {
        this.user = user;
        this.material = material;
        this.returnDate = returnDate;
        createFine();
    }

    private void createFine() {
        if (isLate()) {
            Fine fine = new Fine(user, material, getQuantityOfDaysLate());
            System.out.println(fine.toString());
            user.addFine(fine);
        }
    }

    private boolean isLate() {

        return getQuantityOfDaysLate() > 0;
    }

    private int getQuantityOfDaysLate() {
        Date currentDate = new Date(System.currentTimeMillis());

        return (int) ((currentDate.getTime() - returnDate.getTime()));
    }

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

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
