package production.test.practicefactory;

public class BuildingCarTest {
    public static void main(String[] args) {
        CarFactory jcf = new JapanCarFactory();
        CarFactory ccf = new ChineseCarFactory();

        Car japanCar = jcf.createCar("Flag");
        Car chineseCar = ccf.createCar("Toyota");

    }
}
