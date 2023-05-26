package zrj.shiyan10.test;

public class Robot extends Changer{
    public Robot(Transform transform) {
        super(transform);
    }

    public void say(){
        System.out.println("hello");
    }

    @Override
    public void move() {
        super.move();
        say();
    }
}
