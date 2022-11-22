package models.library.observable;

public class FineSubject extends Subject {
    private Integer value;

    public FineSubject() {
        this.value = 0;
    }

    public Integer getState() {
        return value;
    }

    public void setState() {
        this.value += 3;
        notifyListeners();
    }

}
