package zrj.shiyan7.car;

import zrj.shiyan7.fuel.Fuel;
import zrj.shiyan7.modelLevel.ModelLevel;
import zrj.shiyan7.structure.Structure;

public class Car {
    public ModelLevel modelLevel;

    public ModelLevel getModelLevel() {
        return modelLevel;
    }

    public Fuel fuel;

    public Structure structure;

    @Override
    public String toString() {
        return "Car{" +
                "modelLevel=" + modelLevel +
                '}';
    }

    public Car(ModelLevel modelLevel,Fuel fuel,Structure structure) {
        this.modelLevel = modelLevel;
        this.fuel = fuel;
        this.structure = structure;
    }
}
