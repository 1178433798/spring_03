package zrj.shiyan5;

import zrj.shiyan5.entity.Moreleton;

public class App4 {
    public static void main(String[] args) {


        Moreleton instance = Moreleton.getInstance(1);
        System.out.println(instance);
        Moreleton instance2 = Moreleton.getInstance(1);
        System.out.println(instance2);
        Moreleton instance3 = Moreleton.getInstance(9);
        System.out.println(instance3);


        Thread1 thread1=new Thread1("线程1");
        Thread1 thread2=new Thread1("线程2");
        Thread1 thread3=new Thread1("线程3");
        thread1.start();
        thread2.start();
        thread3.start();

    }




}
