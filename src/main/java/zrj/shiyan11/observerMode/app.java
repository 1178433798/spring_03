package zrj.shiyan11.observerMode;

import zrj.shiyan11.observerMode.observer.*;
import zrj.shiyan11.observerMode.subjec.Sensor;
import zrj.shiyan11.observerMode.subjec.Subject;

public class app {
    public static void main(String[] args) {
        Subject subject=new Sensor();
        Observer alarm=new Alarm();
        subject.attach(alarm);
        subject.attach(new InsulatedDoor());
        subject.attach(new SafeEscapeDoor());
        subject.attach(new WarningLights());
        subject.notice();
        System.out.println("----------------------");
        subject.detach(alarm);
        subject.notice();

    }
}
