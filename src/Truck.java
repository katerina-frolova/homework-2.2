
public class Truck extends Transport implements EngineTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}