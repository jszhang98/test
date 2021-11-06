package production.test.practicefactory;

public class SpeedCar extends Car{
    @Override
    void getCarName() {
        System.out.println("SpeedCar!");
    }

    public SpeedCar(CarFrame cf, CarEngine ce, CarWheel cw) {
        this.carEngine = ce;
        this.carFrame = cf;
        this.carWheel = cw;

    }
}
