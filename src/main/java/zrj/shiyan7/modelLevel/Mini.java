package zrj.shiyan7.modelLevel;

public class Mini extends ModelLevel{
    public String ModelLevel="Mini";

    public String getModelLevel() {
        return ModelLevel;
    }

    public Mini(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "Mini{" +
                "ModelLevel='" + ModelLevel + '\'' +
                ", carInfo=" + carInfo +
                '}';
    }

    public CarInfo carInfo;

}
