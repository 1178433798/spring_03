package zrj.shiyan9.no;

import zrj.shiyan9.no.TicketFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class app {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("zrj");
        users.add("wj");
        List<String> times = new ArrayList<>();
        times.add("4-26");
        times.add("4-27");
        times.add("4-28");

        List<String> trainNumber=new ArrayList<>();
        trainNumber.add("TR1");
        List<String> RoomNumber=new ArrayList<>();
        RoomNumber.add("01");
        RoomNumber.add("02");
        List<String> SeatNumber=new ArrayList<>();
        SeatNumber.add("10A");
        SeatNumber.add("10B");
        SeatNumber.add("10C");
        SeatNumber.add("10D");
        List<String> Fare=new ArrayList<>();
        Fare.add("200");

        List<String> start = new ArrayList<>() ;
        start.add("福州");
        start.add("泉州");
        start.add("南平");
        List<String> end = new ArrayList<>() ;
        end.add("深圳");
        end.add("武汉");
        end.add("上海");
        end.add("厦门");
        Random rand = new Random(System.currentTimeMillis()) ;
        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        long sTime = System.currentTimeMillis();


        for (int i=0; i<1000*10*2; i++) {
            TicketFactory.Buy(
                 start.get(rand.nextInt(start.size())),
                 end.get(rand.nextInt(end.size())),
                 users.get(rand.nextInt(users.size())),
                    times.get(rand.nextInt(times.size())),
                    RoomNumber.get(rand.nextInt(RoomNumber.size())),
                    SeatNumber.get(rand.nextInt(SeatNumber.size())),
                    trainNumber.get(rand.nextInt(trainNumber.size())),
                    Fare.get(rand.nextInt(Fare.size()))
            ) ;
        }

        long eTime = System.currentTimeMillis();
        System.out.println("执行耗时"+(eTime - sTime)+"ms");

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        // 记录程序运行后的内存使用情况
        long usedMemory = memoryAfter - memoryBefore;
        System.out.println("程序运行时内存消耗：" + usedMemory + " 字节");


    }
}
