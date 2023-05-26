package zrj.shiyan7.modelLevel;

public class CarInfo {

    public String Brand;
    public String MotorcycleType;

    @Override
    public String toString() {
        return "CarInfo{" +
                "Brand='" + Brand + '\'' +
                ", MotorcycleType='" + MotorcycleType + '\'' +
                ", StartingPrice=" + StartingPrice +
                '}';
    }

    public int StartingPrice;

    public CarInfo(String brand, String motorcycleType, int startingPrice) {
        Brand = brand;
        MotorcycleType = motorcycleType;
        StartingPrice = startingPrice;
    }
}
