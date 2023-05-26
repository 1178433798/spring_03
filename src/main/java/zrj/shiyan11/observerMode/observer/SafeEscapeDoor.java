package zrj.shiyan11.observerMode.observer;

public class SafeEscapeDoor implements Observer{
    @Override
    public void update() {
        System.out.println("开启安全逃生门");
    }
}
