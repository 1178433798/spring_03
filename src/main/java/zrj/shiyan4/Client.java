package zrj.shiyan4;

import zrj.shiyan4.abstractclass.Shape;
import zrj.shiyan4.exception.UnsupportedShapException;
import zrj.shiyan4.factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        Shape circle = ShapeFactory.createShape("Circle");
        Shape rectangel = ShapeFactory.createShape("Rectangel");
        Shape triangel = ShapeFactory.createShape("Triangel");

        try {
            ShapeFactory.createShape("asd");
        }catch (UnsupportedShapException e){
            System.out.println(e.getMsg());
        }
        circle.draw();
        rectangel.draw();
        triangel.draw();
    }
}
