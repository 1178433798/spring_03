package zrj.shiyan5;

import zrj.shiyan5.entity.Moreleton;

public class Thread1 extends Thread{

    private String name;
    public Thread1(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        Moreleton instance = Moreleton.getInstance();
        System.out.println(name+"-------"+instance+"-------"+instance.getNumber());
    }
}
