package zrj.shiyan11.observerMode.subjec;


import zrj.shiyan11.observerMode.observer.Observer;

public class Sensor extends Subject{
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        observers.forEach(o->o.update());
    }
}
