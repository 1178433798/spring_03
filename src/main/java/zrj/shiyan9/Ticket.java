package zrj.shiyan9;


public class Ticket {

    private final TicketIntrinsic basic ;
    private String Start;
    private String End;
    private String BelongTo;
    private String time;
    public Ticket(TicketIntrinsic basic) {
        this.basic = basic;
    }
    public void Buy(String start,String end,String belongTo,String time){
        this.Start=start;
        this.End=end;
        this.BelongTo=belongTo;
        this.time=time;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "basic=" + basic +
                ", Start='" + Start + '\'' +
                ", End='" + End + '\'' +
                ", BelongTo='" + BelongTo + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
