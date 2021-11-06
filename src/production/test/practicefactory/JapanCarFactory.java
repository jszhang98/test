package production.test.practicefactory;

public class JapanCarFactory implements CarFactory{
    @Override
    public Car createCar(String model) {
        CarFrame japanCarFrame = new GreenCarFrame();
        CarEngine japanEngine = new V8CarEngine();
        CarWheel japanWheel = new I28CarWheel();

        Car japanCar = new SpeedCar(japanCarFrame,japanEngine,japanWheel);

        return japanCar;
    }
}
