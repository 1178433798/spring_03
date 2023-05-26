package zrj.shiyan5.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Moreleton {
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Moreleton(){

    }
    private static List<Moreleton> list=new ArrayList<>();
    static {
        for (int i = 0; i < 3; i++) {
            Moreleton moreleton = new Moreleton();
            moreleton.setNumber(i);
            list.add(moreleton);
        }
    }

    public static Moreleton getInstance(Integer index){
        Moreleton moreleton=null;
        try {
             moreleton = list.get(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组越界，请输入0-2");
        }
        return moreleton;
    }
    public static Moreleton getInstance(){
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }


}
