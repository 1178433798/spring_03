package zrj.shiyan9.no;

public class Ticket {


    private String Start;
    private String End;
    private String BelongTo;
    private String time;
    private String RoomNumber;
    private String SeatNumber;

    @Override
    public String toString() {
        return "Ticket{" +
                "Start='" + Start + '\'' +
                ", End='" + End + '\'' +
                ", BelongTo='" + BelongTo + '\'' +
                ", time='" + time + '\'' +
                ", RoomNumber='" + RoomNumber + '\'' +
                ", SeatNumber='" + SeatNumber + '\'' +
                ", TrainNumber='" + TrainNumber + '\'' +
                ", Fare='" + Fare + '\'' +
                '}';
    }

    private String TrainNumber;

    public Ticket(String start, String end, String belongTo, String time, String roomNumber, String seatNumber, String trainNumber, String fare) {
        Start = start;
        End = end;
        BelongTo = belongTo;
        this.time = time;
        RoomNumber = roomNumber;
        SeatNumber = seatNumber;
        TrainNumber = trainNumber;
        Fare = fare;
    }

    private String Fare;

}
