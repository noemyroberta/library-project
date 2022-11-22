package models.library;

import models.auth.User;

public class Fine {
    private User user;
    private Material material;
    private int quantityOfDaysLate;
    private Integer fineValue;

    public Fine(User user, Material material, int quantityOfDaysLate) {
        this.user = user;
        this.material = material;
        this.quantityOfDaysLate = quantityOfDaysLate;
    }

    public Integer totalFine() {
        return 0;
    }

    public void setFineValue(Integer fineValue) {
        this.fineValue = fineValue;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "user=" + user +
                ", material=" + material +
                ", quantityOfDaysLate=" + quantityOfDaysLate +
                ", fineValue=" + fineValue +
                '}';
    }
}
