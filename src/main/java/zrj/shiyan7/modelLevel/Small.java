package zrj.shiyan7.modelLevel;

public class Small extends ModelLevel{
    public String ModelLevel="Small";

    public String getModelLevel() {
        return ModelLevel;
    }
    public Small(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "Small{" +
                "ModelLevel='" + ModelLevel + '\'' +
                ", carInfo=" + carInfo +
                '}';
    }

    public CarInfo carInfo;
}
