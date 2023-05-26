package zrj.shiyan11.observerMode.observer;

public class Alarm implements Observer{
    @Override
    public void update() {
        System.out.println("报警器发出警报");
    }
}
