package production.test.practicefactory;

public abstract class Car {
    CarFrame carFrame;
    CarEngine carEngine;
    CarWheel carWheel;
    String carName;
    abstract void getCarName();
}
