package zrj.shiyan9;


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
        List<String> ticketKeys = new ArrayList<>() ;
        ticketKeys.add("TR1_01_10A");
        ticketKeys.add("TR1_01_10B");
        ticketKeys.add("TR1_01_10C");
        ticketKeys.add("TR1_01_10D");
        ticketKeys.add("TR1_02_10A");
        ticketKeys.add("TR1_02_10B");
        ticketKeys.add("TR1_02_10C");
        ticketKeys.add("TR1_02_10D");
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

        for (int i=0; i<1000*10*10; i++) {
          TicketFactory.Buy(
                    times.get(rand.nextInt(times.size())),
                    users.get(rand.nextInt(users.size())),
                    ticketKeys.get(rand.nextInt(ticketKeys.size())),
                    start.get(rand.nextInt(start.size())),
                    end.get(rand.nextInt(end.size()))
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
