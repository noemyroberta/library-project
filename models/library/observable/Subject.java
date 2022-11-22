package models.library.observable;

import java.util.ArrayList;

public abstract class Subject implements ISubject {
    private ArrayList<IObserver> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(IObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyListeners() {
        for (IObserver listener : observers) {
            listener.update();
        }
    }

}
