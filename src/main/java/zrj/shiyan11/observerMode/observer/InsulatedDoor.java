package zrj.shiyan11.observerMode.observer;

public class InsulatedDoor implements Observer{
    @Override
    public void update() {
        System.out.println("隔热门关闭");
    }
}
