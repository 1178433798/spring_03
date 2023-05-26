package zrj.shiyan7.car;

import java.util.List;
import java.util.stream.Collectors;

public class ByFollowing {
    static public void follow(List<Car> list){
        System.out.println("------------Mini--------------------");
        List<Car> MiniList = list.stream().filter(item -> item.getModelLevel().getModelLevel().equals("Mini")).collect(Collectors.toList());
        MiniList.forEach((item)->{
            System.out.println(item.toString());
        });
        System.out.println("------------Small--------------------");
        List<Car> SmallList = list.stream().filter(item -> item.getModelLevel().getModelLevel().equals("Small")).collect(Collectors.toList());
        SmallList.forEach((item)->{
            System.out.println(item.toString());
        });
        System.out.println("------------Compact--------------------");
        List<Car> CompactList = list.stream().filter(item -> item.getModelLevel().getModelLevel().equals("Compact")).collect(Collectors.toList());
        CompactList.forEach((item)->{
            System.out.println(item.toString());
        });
    }
}
