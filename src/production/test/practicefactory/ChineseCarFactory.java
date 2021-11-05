package production.test.practicefactory;

public class ChineseCarFactory implements CarFactory{
    @Override
    public Car createCar(String model) {

        CarFrame chineseCarFrame = new RedCarFrame();
        CarWheel chineseCarWheel = new I24CarWheel();
        Car chineseCar = new BigWheelCar(chineseCarFrame,null, chineseCarWheel);

        return chineseCar;
    }
}
