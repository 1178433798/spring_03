package zrj.shiyan11.observerMode.observer;

public class WarningLights implements Observer{
    @Override
    public void update() {
        System.out.println("警示灯闪烁");
    }
}
