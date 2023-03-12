public class Car extends Transport implements EngineTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}