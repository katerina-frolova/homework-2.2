public class ServiceStation {
    public void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void checkEngine(EngineTransport engineTransport) {
        engineTransport.checkEngine();
    }

    public void checkTrailer(Truck truck) {
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        checkTransport(bicycle);
    }

    public void check(Car car) {
        checkTransport(car);
        checkEngine(car);
    }

    public void check(Truck truck) {
        checkTransport(truck);
        checkEngine(truck);
        checkTrailer(truck);
    }
}
