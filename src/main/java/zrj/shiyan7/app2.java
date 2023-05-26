package zrj.shiyan7;

import zrj.shiyan7.car.ByFollowing;
import zrj.shiyan7.car.Car;
import zrj.shiyan7.fuel.DieselOil;
import zrj.shiyan7.fuel.Electric;
import zrj.shiyan7.fuel.Gasoline;
import zrj.shiyan7.modelLevel.CarInfo;
import zrj.shiyan7.modelLevel.Compact;
import zrj.shiyan7.modelLevel.Mini;
import zrj.shiyan7.modelLevel.Small;
import zrj.shiyan7.structure.Hatchback;
import zrj.shiyan7.structure.MPV;

import java.util.ArrayList;
import java.util.List;

public class app2 {

    public static void main(String[] args) {

        Car car=new Car(new Mini(new CarInfo("五菱宏光","MINIEV",32800)),new Gasoline(),new Hatchback());
        Car car1=new Car(new Mini(new CarInfo("比亚迪","e1",59900)),new DieselOil(),new MPV());
        Car car2=new Car(new Mini(new CarInfo("吉利","熊猫mini",39900)),new Electric(),new Hatchback());
        Car car3=new Car(new Small(new CarInfo("比亚迪","海豚",116800)),new Electric(),new Hatchback());
        Car car4=new Car(new Small(new CarInfo("大众","Polo",90900)),new Electric(),new Hatchback());
        Car car5=new Car(new Small(new CarInfo("本田","飞度",81800)),new Electric(),new Hatchback());
        Car car6=new Car(new Compact(new CarInfo("大众","朗逸",120900)),new Electric(),new Hatchback());
        Car car7=new Car(new Compact(new CarInfo("日产","轩逸",99800)),new Electric(),new Hatchback());

        List list=new ArrayList<Car>();
        list.add(car);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        list.add(car7);

        ByFollowing.follow(list);



    }

}
