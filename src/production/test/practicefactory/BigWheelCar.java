package production.test.practicefactory;


public class BigWheelCar extends Car{
    @Override
    void getCarName() {
        System.out.println("SpeedCar!");
    }

    public BigWheelCar(CarFrame cf, CarEngine ce, CarWheel cw) {
        this.carEngine = ce;
        this.carFrame = cf;
        this.carWheel = cw;

    }
}
