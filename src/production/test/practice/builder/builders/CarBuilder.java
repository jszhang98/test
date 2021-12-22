package production.test.practice.builder.builders;

import production.test.practice.builder.cars.Car;
import production.test.practice.builder.cars.CarType;
import production.test.practice.builder.components.Engine;
import production.test.practice.builder.components.GPSNavigator;
import production.test.practice.builder.components.Transmission;
import production.test.practice.builder.components.TripComputer;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type){
       this.type = type;

    }

    @Override
    public void setSeats(int seats) {

        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission=transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer=tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
    public Car getResult(){
        Car car = new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
        return car;
    }
}
