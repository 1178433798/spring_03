package zrj;

import java.util.*;

/**
 * @author Ping
 * @date 2023/4/19 19:58
 **/
public class FlyweightDemo {
    public static void main(String args[]) {
        List<String> users = new ArrayList<>();
        users.add("zhangsan");
        users.add("lisi");
        users.add("wangwu");
        List<String> times = new ArrayList<>();
        times.add("2-21");
        times.add("2-22");
        times.add("2-23");
        Random rand = new Random(System.currentTimeMillis()) ;
        List<String> ticketKeys = new ArrayList<>() ;
        ticketKeys.add("D2301_1_12A");
        ticketKeys.add("D2301_1_12B");
        ticketKeys.add("D2301_1_12C");
        for (int i=0; i<10; i++) {
            TicketFactory.buyTicket(
                    times.get(rand.nextInt(times.size())),
                    users.get(rand.nextInt(users.size())),
                    ticketKeys.get(rand.nextInt(ticketKeys.size()))) ;
        }



    }
}

/**
 * intrinsic state
 */
class TicketIntrinsic {
    /**
     * shareable properties/ intrinsic state
     */
    private String trainNo ;
    private String roomNo ;
    private String seatNo ;


    public TicketIntrinsic(String trainNo, String roomNo, String seatNo) {
        this.trainNo = trainNo;
        this.roomNo = roomNo;
        this.seatNo = seatNo;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    @Override
    public String toString() {
        return "TicketIntrinsic{" +
                "trainNo='" + trainNo + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }
}

/**
 * Flyweight role
 */
class Ticket {
        public static final String OCCUPIED = "occupied" ;
        public static final String VACANT = "vacant" ;
    /**
     * shareable state of flyweight object
     */
    private final TicketIntrinsic basic ;
    /**
     * unshareable state, ie., extrinsic state
     */
    String time ;
    String user ;
    String state ;


        public Ticket(TicketIntrinsic basic) {
            this.basic = basic;
        }

    /**
     * operation on ticket
     * @param time
     * @param userName
     */
        public void buyTicket(String time, String userName) {
            this.time = time ;
            this.user = userName;
            this.state = OCCUPIED ;

        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "trainNo=" + this.basic.getTrainNo() +
                    "roomNo=" + this.basic.getRoomNo() +
                    "seatNo=" + this.basic.getSeatNo() +
                    ", time='" + time + '\'' +
                    ", user='" + user + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
}

class TicketFactory {
    /**
     * map for sharing ticket intrinsic state
     */
    private static Map<String, TicketIntrinsic> TicketIntrinsicMap = new HashMap<>() ;

    private static Map<String, Ticket> TicketBuyHistory = new HashMap<>() ;
    static {
        TicketIntrinsicMap.put("D2301_1_12A", new TicketIntrinsic("D2301", "1", "12A")) ;
        TicketIntrinsicMap.put("D2301_1_12B", new TicketIntrinsic("D2301", "1", "12B")) ;
        TicketIntrinsicMap.put("D2301_1_12C", new TicketIntrinsic("D2301", "1", "12C")) ;
    }

    public static Ticket buyTicket(String time, String user, String ticketKey ) {
        if (TicketBuyHistory.containsKey(ticketKey+"_"+time)) {
            System.out.println("[INFO]" + ticketKey + "was not available.") ;
            return null;
        }
        /**
         * here, the sharing was occurring.
         */
        Ticket ticket = new Ticket(TicketIntrinsicMap.get(ticketKey)) ;
        ticket.buyTicket(time, user);
        TicketBuyHistory.put(ticketKey+"_"+time, ticket) ;
        System.out.println("[INFO] a ticket " + ticket + " was sold successfully.") ;
        return ticket ;
    }



}



