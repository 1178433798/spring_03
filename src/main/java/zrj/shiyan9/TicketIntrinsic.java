package zrj.shiyan9;

public class TicketIntrinsic {
    private String RoomNumber;
    private String SeatNumber;
    private String TrainNumber;
    private String Fare;
    public TicketIntrinsic(String roomNumber, String seatNumber, String trainNumber, String fare) {
        RoomNumber = roomNumber;
        SeatNumber = seatNumber;
        TrainNumber = trainNumber;
        Fare = fare;
    }
    public String getRoomNumber() {
        return RoomNumber;
    }

    public String getSeatNumber() {
        return SeatNumber;
    }

    public String getTrainNumber() {
        return TrainNumber;
    }

    public String getFare() {
        return Fare;
    }

    @Override
    public String toString() {
        return "TicketIntrinsic{" +
                "RoomNumber='" + RoomNumber + '\'' +
                ", SeatNumber='" + SeatNumber + '\'' +
                ", TrainNumber='" + TrainNumber + '\'' +
                ", Fare='" + Fare + '\'' +
                '}';
    }
}
