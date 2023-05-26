package zrj.shiyan7.modelLevel;

public abstract class ModelLevel {
    @Override
    public String toString() {
        return "ModelLevel{" +
                "ModelLevel='" + ModelLevel + '\'' +
                ", carInfo=" + carInfo +
                '}';
    }

    public String getModelLevel() {
        return ModelLevel;
    }

    public String ModelLevel;
    public CarInfo carInfo;
}
