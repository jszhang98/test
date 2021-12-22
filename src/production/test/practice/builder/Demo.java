package production.test.practice.builder;

import production.test.practice.builder.builders.CarBuilder;
import production.test.practice.builder.builders.CarManualBuilder;
import production.test.practice.builder.cars.Car;
import production.test.practice.builder.cars.Manual;
import production.test.practice.builder.builders.Director;

public class Demo {
    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n"+car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportCar(manualBuilder);
        Manual carManu = manualBuilder.getResult();
        System.out.println("\n Car manual built:\n"+carManu.print());
    }
}
