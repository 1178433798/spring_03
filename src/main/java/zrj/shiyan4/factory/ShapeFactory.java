package zrj.shiyan4.factory;

import zrj.shiyan4.abstractclass.Shape;
import zrj.shiyan4.entity.Circle;
import zrj.shiyan4.entity.Rectangle;
import zrj.shiyan4.entity.Triangle;
import zrj.shiyan4.exception.UnsupportedShapException;

public class ShapeFactory {
    public static Shape createShape(String type) throws UnsupportedShapException {
        if (type.equals("Circle")){
            return new Circle();
        } else if (type.equals("Rectangel")) {
            return new Rectangle();
        } else if (type.equals("Triangel")) {
            return new Triangle();
        }else {
            throw new UnsupportedShapException("无法画出图形");
        }
    }
}
