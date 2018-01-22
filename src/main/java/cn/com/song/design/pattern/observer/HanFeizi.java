package cn.com.song.design.pattern.observer;

import java.util.ArrayList;

public class HanFeizi implements IHanFeizi, Observable {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    @Override
    public void haveBreakfirst() {
        this.notifyObservers("韩非子在吃早饭...");
    }
}
