package zrj.shiyan11.observerMode.subjec;

import zrj.shiyan11.observerMode.observer.Observer;

import java.util.ArrayList;


public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList();
    public abstract void attach(Observer observer);
     public abstract void detach(Observer observer);
     public abstract void notice();

}
