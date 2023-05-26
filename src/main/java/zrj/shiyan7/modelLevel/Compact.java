package zrj.shiyan7.modelLevel;

public class Compact extends ModelLevel{
    public String ModelLevel="Compact";

    public String getModelLevel() {
        return ModelLevel;
    }

    public Compact(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "Compact{" +
                "ModelLevel='" + ModelLevel + '\'' +
                ", carInfo=" + carInfo +
                '}';
    }

    public CarInfo carInfo;
}
