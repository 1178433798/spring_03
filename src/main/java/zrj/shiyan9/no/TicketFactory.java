package zrj.shiyan9.no;

import zrj.shiyan9.no.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {

    public static Map<String, Ticket> TicketMap=new HashMap<>();

    public static Ticket Buy(String start, String end, String belongTo, String time, String roomNumber, String seatNumber, String trainNumber, String fare){

        String key = trainNumber + "_" + roomNumber + "_" + seatNumber + "_" + time + "_" + start + "_" + end;

        if (TicketMap.containsKey(key)){
            System.out.println("该车票已经出售") ;
            return null;
        }
        Ticket ticket = new Ticket(start, end, belongTo, time, roomNumber, seatNumber, trainNumber, fare);

        TicketMap.put(key,ticket);

        System.out.println( ticket + "出售成功") ;
        return ticket;
    }

}
