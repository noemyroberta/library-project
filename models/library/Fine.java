package models.library;

import models.auth.User;

public class Fine {
    private User user;
    private Material material;
    private int quantityOfDaysLate;
    private Integer fineValue;

    public Fine(User user, Material material, int quantityOfDaysLate, Integer fineValue) {
        this.user = user;
        this.material = material;
        this.quantityOfDaysLate = quantityOfDaysLate;
        this.fineValue = fineValue;
    }

    public Integer totalFine() {
        return 0;
    }
}
