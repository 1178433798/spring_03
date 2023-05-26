package zrj.shiyan9;


import java.util.HashMap;
import java.util.Map;

public class TicketFactory {
    public static Map<String,TicketIntrinsic> IntrinsicMap=new HashMap<>();
    public static Map<String,Ticket> TicketMap=new HashMap<>();
    static {
        IntrinsicMap.put("TR1_01_10A",new TicketIntrinsic("01","10A","TR01","200"));
        IntrinsicMap.put("TR1_01_10B",new TicketIntrinsic("01","10B","TR01","200"));
        IntrinsicMap.put("TR1_01_10C",new TicketIntrinsic("01","10C","TR01","200"));
        IntrinsicMap.put("TR1_01_10D",new TicketIntrinsic("01","10D","TR01","200"));
        IntrinsicMap.put("TR1_02_10A",new TicketIntrinsic("02","10A","TR01","200"));
        IntrinsicMap.put("TR1_02_10B",new TicketIntrinsic("02","10B","TR01","200"));
        IntrinsicMap.put("TR1_02_10C",new TicketIntrinsic("02","10C","TR01","200"));
        IntrinsicMap.put("TR1_02_10D",new TicketIntrinsic("02","10D","TR01","200"));
    }
    public static Ticket Buy(String time,String BelongTo, String ticketKey,String Start,String End){
        if (TicketMap.containsKey(ticketKey+"_"+time+"_"+Start+"_"+End)) {
            System.out.println("该车票已经出售") ;
            return null;
        }
        Ticket ticket = new Ticket(IntrinsicMap.get(ticketKey)) ;
        ticket.Buy(Start,End,BelongTo,time);
        TicketMap.put(ticketKey+"_"+time+"_"+Start+"_"+End, ticket) ;
        System.out.println( ticket + "出售成功") ;
        return ticket ;

    }

}
