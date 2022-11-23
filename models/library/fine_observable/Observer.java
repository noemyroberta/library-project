package models.library.fine_observable;

public class Observer implements IObserver {

    private FineSubject fineSubject;

    public Observer(FineSubject fineSubject) {
        this.fineSubject = fineSubject;
    }

    @Override
    public void update() {
        System.out.println(fineSubject.getState());
    }

}

